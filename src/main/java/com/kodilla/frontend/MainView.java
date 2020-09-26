package com.kodilla.frontend;

import com.kodilla.frontend.domain.EmployeeDto;
import com.kodilla.frontend.domain.EmployeeService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.Route;


@Route
public class MainView extends VerticalLayout {

    private Grid <EmployeeDto>grid = new Grid<>(EmployeeDto.class);

    private EmployeeService employeeService = EmployeeService.getInstance();


    public MainView() {
        add(new Button("Click", e -> Notification.show("xD")));
        grid.setColumns("fullName", "degree");
        add(grid);
        setSizeFull();
        refresh();
    }

    public void refresh() {
        grid.setItems(employeeService.fetchEmployees());
    }
}
