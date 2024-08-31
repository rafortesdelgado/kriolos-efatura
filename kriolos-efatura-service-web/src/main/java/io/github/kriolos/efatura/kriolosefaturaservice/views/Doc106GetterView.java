package io.github.kriolos.efatura.kriolosefaturaservice.views;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.Grid.SelectionMode;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.theme.lumo.LumoUtility;

import io.github.kriolos.efatura.Program;
import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.api.DfeApi;
import io.github.kriolos.efatura.kriolosefaturaservice.models.Client;
import io.github.kriolos.efatura.kriolosefaturaservice.services.ClientService;
import io.github.kriolos.efatura.services.FiscalReportService;
import io.github.kriolos.efatura.services.GetTokenHelper;
// import io.github.kriolos.efatura.services.FiscalReportService;
import jakarta.annotation.security.PermitAll;

@PermitAll
@Route(value="fiscalReport/:direction", layout = MainLayout.class) 
public class Doc106GetterView extends VerticalLayout implements BeforeEnterObserver{ 

    private final ClientService clientService;
    private String direction = null;
    
    public Doc106GetterView(ClientService clientService) {

        this.clientService = clientService;
        
        Grid<Client> grid = new Grid<>(Client.class, true);
        grid.setSelectionMode(SelectionMode.MULTI);

        grid.setItems(clientService.getClients().toList());
        
        HorizontalLayout div = new HorizontalLayout();
        DatePicker startDatePicker = new DatePicker("Start date");
        DatePicker endDatePicker = new DatePicker("End date");

        ComboBox<String> directionComboBox = new ComboBox<String>("Direcção");
        directionComboBox.setItems(new String [] {"Emitidos" , "Recebidos", "Ambos"});

        Button searchButton = new Button("Pesquisar");

        searchButton.addClickListener(clickEvent -> {
            run(startDatePicker.getValue(), endDatePicker.getValue(), directionComboBox.getValue() );
        });

        searchButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        div.add(startDatePicker, endDatePicker, directionComboBox);

        add(div);
        add(searchButton);
        add(grid);

    }


    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        // TODO Auto-generated method stub
        direction = event.getRouteParameters().get("direction").get();
    }

    public void run( LocalDate startDate, LocalDate endDate, String direction  ) 
    {
        ApiClient apiCli = new ApiClient();
		apiCli.setDebugging(false);
		DfeApi dfeApi = new DfeApi(apiCli);
        Stream<Client> list = clientService
            .getClients();

		for( Client c : list.toList()) 
		{
			try
			{
				String jwt = GetTokenHelperV2.init(c.getNif() + "", c.getPassword()); 
				String token = jwt;

				apiCli.setBasePath("https://services.efatura.cv/");
				apiCli.setAccessToken(token);
				FiscalReportService frs = new FiscalReportService(dfeApi);

                if(direction.equals("in") || direction.equals("all"))
                    frs.getMod106Suppliers("2024", startDate.toString(), endDate.toString());  
                
                    if(direction.equals("out") || direction.equals("all"))
				    frs.getMod106Clients("2024", startDate.toString(), endDate.toString());

			}
			catch(Exception e ) 
			{
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			finally 
			{
			}
			
		}
    }

}
