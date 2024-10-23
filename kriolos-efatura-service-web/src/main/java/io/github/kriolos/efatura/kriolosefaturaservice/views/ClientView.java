package io.github.kriolos.efatura.kriolosefaturaservice.views;


import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Focusable;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.editor.Editor;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.Route;

import io.github.kriolos.efatura.kriolosefaturaservice.components.CrudGrid;
import io.github.kriolos.efatura.kriolosefaturaservice.models.Client;
import io.github.kriolos.efatura.kriolosefaturaservice.repositories.ClientRepository;
import jakarta.annotation.security.PermitAll;

@PermitAll
@Route(value="clients", layout = MainLayout.class) 
public class ClientView extends VerticalLayout { 

    ClientRepository clientRepository;
    private Grid<Client> grid;
    private Editor<Client> editor;
    private Binder<Client> binder;
    
    public ClientView(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
        
        this.grid = new Grid<>(Client.class, true);
        
        this.binder = new Binder<Client>(Client.class);
        this.editor = grid.getEditor();

        editor.setBinder(binder);
        editor.setBuffered(true);
        // binder.bindInstanceFields(this);

        var addButton = new Button("Novo Cliente", VaadinIcon.PLUS.create());
        var deleteButton = new Button("Remover Cliente", VaadinIcon.MINUS.create());

        addButton.addClickListener(e -> savePerson());
        deleteButton.addClickListener(e -> deletePerson());
        
        grid.setItems(clientRepository.findAll());

        grid.asSingleSelect().addValueChangeListener(event -> {
            if (event.getValue() != null) {
                binder.setBean(event.getValue());
            } else {
                binder.setBean(new Client());
            }
        });

        grid.addItemDoubleClickListener(e -> {
            Client client = e.getItem();
            editor.editItem(client);
            TextField editorComponent = (TextField) e.getColumn().getEditorComponent();
            editorComponent.onEnabledStateChanged(true);

            e.getColumn().getId();
            editorComponent.setValue(null);
            // if(editorComponent instanceof Focusable) 
            // {
            //     ((Focusable) editorComponent).focus();
            // }
        });

        var horizontalLayout = new HorizontalLayout( addButton, deleteButton);
        add(horizontalLayout , grid);
    }

    private void savePerson() {
        Client person = binder.getBean();
        clientRepository.save(person);
        updateGrid();
    }

    private void deletePerson() {
        Client person = binder.getBean();
        clientRepository.delete(person);
        updateGrid();
    }

    private void updateGrid() {
        grid.setItems(clientRepository.findAll());
    }
}
