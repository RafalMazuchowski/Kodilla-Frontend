package com.kodilla.frontend;

import com.kodilla.frontend.views.EmployeesView;
import com.kodilla.frontend.views.MenuView;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {

    public static final String BASE_API_URL = "http://localhost:8080/";
    private MenuView menuView = new MenuView();
    private EmployeesView employeesView = new EmployeesView();

    public MainView() {
        add(new Button("Click", e -> Notification.show("xD")));
        add(menuView);
        add(employeesView);
        setSizeFull();
    }
}
