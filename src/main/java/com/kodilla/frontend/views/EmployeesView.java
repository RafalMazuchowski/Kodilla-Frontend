package com.kodilla.frontend.views;

import com.kodilla.frontend.models.EmployeeDto;
import com.kodilla.frontend.services.EmployeeService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class EmployeesView extends VerticalLayout {
    private Grid <EmployeeDto>grid = new Grid<>(EmployeeDto.class);
    private EmployeeForm form = new EmployeeForm(this);
    private Button addNewEmployee = new Button("Add new employee");

    private EmployeeService employeeService = EmployeeService.getInstance();

    public EmployeesView() {
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
