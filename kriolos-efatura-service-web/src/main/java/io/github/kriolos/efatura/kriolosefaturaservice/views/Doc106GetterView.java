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
// import io.github.kriolos.efatura.services.FiscalReportService;
import jakarta.annotation.security.PermitAll;

@PermitAll
@Route(value="fiscalReport", layout = MainLayout.class) 
public class Doc106GetterView extends HorizontalLayout { 

    // FiscalReportService fiscalReportService;
    
    public Doc106GetterView() {
        
    }
}
