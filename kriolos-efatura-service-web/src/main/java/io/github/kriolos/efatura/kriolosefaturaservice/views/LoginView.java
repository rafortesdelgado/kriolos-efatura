// package io.github.kriolos.efatura.kriolosefaturaservice.views;

// import com.vaadin.flow.component.UI;
// import com.vaadin.flow.component.applayout.AppLayout;
// import com.vaadin.flow.component.applayout.DrawerToggle;
// import com.vaadin.flow.component.button.Button;
// import com.vaadin.flow.component.html.H1;
// import com.vaadin.flow.component.html.Paragraph;
// import com.vaadin.flow.component.login.LoginForm;
// import com.vaadin.flow.component.orderedlayout.FlexComponent;
// import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
// import com.vaadin.flow.component.orderedlayout.Scroller;
// import com.vaadin.flow.component.orderedlayout.VerticalLayout;
// import com.vaadin.flow.component.sidenav.SideNav;
// import com.vaadin.flow.router.Route;
// import com.vaadin.flow.theme.lumo.LumoUtility;

// import jakarta.annotation.security.PermitAll;


// @PermitAll
// @Route(value="login") 
// public class LoginView extends HorizontalLayout  {

//     public LoginView() {
//         LoginForm loginForm = new LoginForm();
//         add(loginForm);
//         loginForm.setForgotPasswordButtonVisible(false);
//         loginForm.addLoginListener((e) -> 
//         {
//             String username = e.getUsername();
//             String password = e.getPassword();

//             if(username.equals("rafortes") && password.equals("lausdeo156")) 
//             {
//                 UI.getCurrent().navigate("");
//             }
//         });

//         setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
//     }
// }
