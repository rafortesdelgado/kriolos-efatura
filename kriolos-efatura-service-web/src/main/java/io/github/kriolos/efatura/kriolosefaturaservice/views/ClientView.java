package io.github.kriolos.efatura.kriolosefaturaservice.views;


import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.theme.lumo.LumoUtility;

import io.github.kriolos.efatura.kriolosefaturaservice.services.ClientService;
import io.github.kriolos.efatura.models.Client;
import jakarta.annotation.security.PermitAll;

@PermitAll
@Route(value="clients", layout = MainLayout.class) 
public class ClientView extends HorizontalLayout { 

    ClientService clientService;
    
    public ClientView(ClientService clientService) {
        this.clientService = clientService;
        Grid<Client> grid = new Grid<>(Client.class, true);
        // grid.addColumn(Client::getNif).setHeader("Nif");
        // grid.addColumn(Client::getName).setHeader("Name");
        // grid.addColumn(Client::getPassword).setHeader("password");

        Stream<Client> clients = clientService.getClients();
        grid.setItems(clients.toList());

        grid.addSelectionListener(selection -> {
            Optional<Client> optionalPerson = selection.getFirstSelectedItem();
            if (optionalPerson.isPresent()) {
                // System.out.printf("Selected person: %s%n",
                // optionalPerson.get().getFullName());
            }
        });

        add(grid);
    }
}
