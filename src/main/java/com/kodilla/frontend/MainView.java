package com.kodilla.frontend;

import com.kodilla.frontend.views.CarsView;
import com.kodilla.frontend.views.EmployeesView;
import com.kodilla.frontend.views.RentsView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {

    public static final String BASE_API_URL = "http://localhost:8080/";
    private EmployeesView employeesView = new EmployeesView();
    private CarsView carsView = new CarsView();
    private RentsView rentsView = new RentsView();
    private Component currentView;
    private Button cars = new Button("Cars");
    private Button rents = new Button("Rents");
    private Button employees = new Button("Employees");

    public MainView() {
        cars.addClickListener(e -> {
            replace(currentView, carsView);
            currentView = carsView;
            Notification.show("cars");
        });
        rents.addClickListener(e -> {
            replace(currentView, rentsView);
            currentView = rentsView;
            Notification.show("rents");
        });
        employees.addClickListener(e -> {
            replace(currentView, employeesView);
            currentView = employeesView;
            Notification.show("employees");
        });
        HorizontalLayout menu = new HorizontalLayout();
        menu.add(new Button("Click", e -> Notification.show("xD")), cars, rents, employees);
        add(menu);
        currentView = employeesView;
        add(employeesView);
        setSizeFull();
    }
}
