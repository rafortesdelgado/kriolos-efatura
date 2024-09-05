package io.github.kriolos.efatura.kriolosefaturaservice.views;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDate;
import java.util.concurrent.Executors;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.Grid.SelectionMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.Route;

import io.github.kriolos.efatura.clientapi.generated.ApiClient;
import io.github.kriolos.efatura.clientapi.generated.api.DfeApi;
import io.github.kriolos.efatura.kriolosefaturaservice.components.DateRangePicker;
import io.github.kriolos.efatura.kriolosefaturaservice.models.Client;
import io.github.kriolos.efatura.kriolosefaturaservice.repositories.ClientRepository;
import io.github.kriolos.efatura.services.FiscalReportService;
import io.github.kriolos.efatura.services.GetTokenHelper;
import jakarta.annotation.security.PermitAll;

@PermitAll
@Route(value = "fiscalReport/:direction", layout = MainLayout.class)
public class Doc106GetterView extends VerticalLayout implements BeforeEnterObserver {

    private final ClientRepository clientService;
    private String direction = null;

    public Doc106GetterView(ClientRepository clientService) {

        this.clientService = clientService;

        Grid<Client> grid = new Grid<>(Client.class, true);
        grid.setSelectionMode(SelectionMode.MULTI);

        grid.setItems(clientService.findAll());

        HorizontalLayout div = new HorizontalLayout();

        DateRangePicker rangePicker = new DateRangePicker();
        DatePicker startDatePicker = new DatePicker("Start date");
        DatePicker endDatePicker = new DatePicker("End date");

        ComboBox<String> directionComboBox = new ComboBox<String>();
        directionComboBox.setPlaceholder("Direcção");

        directionComboBox.setItems(new String[] { "Emitidos", "Recebidos", "Ambos" });

        Button searchButton = new Button("Pesquisar");

        searchButton.addClickListener(clickEvent -> {
            Executors.newSingleThreadExecutor().execute(new Runnable() {
                @Override
                public void run() {
                    runAction(startDatePicker.getValue(), endDatePicker.getValue(), directionComboBox.getValue());
                }
            });
        });

        searchButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        div.add(rangePicker, directionComboBox);

        add(div, searchButton, grid);
    }

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        direction = event.getRouteParameters().get("direction").get();
    }

    private void runAction(LocalDate startDate, LocalDate endDate, String direction) {
        ApiClient apiCli = new ApiClient();
        apiCli.setDebugging(false);
        DfeApi dfeApi = new DfeApi(apiCli);

        HttpClient httpClient = HttpClient.newHttpClient();
        URI uri = URI.create("http://localhost:8081/hello/fiscal");

        for (Client c : clientService.findAll()) {
            try {
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(uri)
                        .GET()
                        .build();

                HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

                String token = response.body().intern();

                apiCli.setBasePath("https://services.efatura.cv/");
                apiCli.setAccessToken(token);
                FiscalReportService frs = new FiscalReportService(dfeApi);

                if (direction.equals("in") || direction.equals("all"))
                    frs.getMod106Suppliers("2024", startDate.toString(), endDate.toString());

                if (direction.equals("out") || direction.equals("all"))
                    frs.getMod106Clients("2024", startDate.toString(), endDate.toString());

            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            } finally {
            }

        }
    }
}
