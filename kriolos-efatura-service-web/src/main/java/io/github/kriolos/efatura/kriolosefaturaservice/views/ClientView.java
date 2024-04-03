package io.github.kriolos.efatura.kriolosefaturaservice.views;


import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Focusable;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.editor.Editor;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.theme.lumo.LumoUtility;

import io.github.kriolos.efatura.kriolosefaturaservice.models.Client;
import io.github.kriolos.efatura.kriolosefaturaservice.services.ClientService;
import jakarta.annotation.security.PermitAll;

@PermitAll
@Route(value="clients", layout = MainLayout.class) 
public class ClientView extends HorizontalLayout { 

    ClientService clientService;
    
    public ClientView(ClientService clientService) {
        this.clientService = clientService;
        
        Grid<Client> grid = new Grid<>(Client.class, true);
        
        Editor<Client> editor = grid.getEditor();
        Binder<Client> binder = new Binder<Client>(Client.class);
        editor.setBinder(binder);
        
        Stream<Client> clients = clientService.getClients();
        grid.setItems(clients.toList());
        //grid.setDropMode();

        grid.addSelectionListener(selection -> {
            Optional<Client> optionalPerson = selection.getFirstSelectedItem();
            if (optionalPerson.isPresent()) {
                editor.editItem(optionalPerson.get());

                // System.out.printf("Selected person: %s%n",
                // optionalPerson.get().getFullName());
            }
        });

        grid.addItemDoubleClickListener(e -> {
            Client client = e.getItem();
            editor.editItem(client);
            Component editorComponent = e.getColumn().getEditorComponent();
            if(editorComponent instanceof Focusable) 
            {
                ((Focusable) editorComponent).focus();
            }
        });

        add(grid);
    }
}
