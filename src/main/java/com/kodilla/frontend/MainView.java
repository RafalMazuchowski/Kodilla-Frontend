package com.kodilla.frontend;

import com.kodilla.frontend.models.EmployeeDto;
import com.kodilla.frontend.services.EmployeeService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.Route;


@Route
public class MainView extends VerticalLayout {

    public static final String BASE_API_URL = "http://localhost:8080/";
    private Grid <EmployeeDto>grid = new Grid<>(EmployeeDto.class);
    private EmployeeForm form = new EmployeeForm(this);
    private Button addNewEmployee = new Button("Add new employee");

    private EmployeeService employeeService = EmployeeService.getInstance();


    public MainView() {
        add(new Button("Click", e -> Notification.show("xD")));
        addNewEmployee.addClickListener(e -> {
            grid.asSingleSelect().clear();
            form.setEmployee(new EmployeeDto());
        });
        add(addNewEmployee);
        grid.setColumns("fullName", "degree");

        HorizontalLayout mainContent = new HorizontalLayout(grid, form);
        mainContent.setSizeFull();
        grid.setSizeFull();

        add(mainContent);
        form.setEmployee(null);
        setSizeFull();
        refresh();

        grid.asSingleSelect().addValueChangeListener(event -> form.setEmployee(grid.asSingleSelect().getValue()));
    }

    public void refresh() {
        grid.setItems(employeeService.fetchEmployees());
    }
}
