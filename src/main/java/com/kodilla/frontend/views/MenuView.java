package com.kodilla.frontend.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class MenuView extends HorizontalLayout {
    private Button cars = new Button("Cars");
    private Button rents = new Button("Rents");
    private Button employees = new Button("Employees");

    public MenuView() {
        cars.addClickListener(e -> {
            Notification.show("cars");
        });
        rents.addClickListener(e -> {
            Notification.show("rents");
        });
        employees.addClickListener(e -> {
            Notification.show("employees");
        });
        add(cars, rents, employees);
    }
}
