package com.kodilla.frontend.views;

import com.kodilla.frontend.models.Degree;
import com.kodilla.frontend.models.EmployeeDto;
import com.kodilla.frontend.services.EmployeeService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.data.binder.PropertyId;


public class EmployeeForm extends FormLayout {

    private EmployeeService employeeService = EmployeeService.getInstance();
    private EmployeesView employeeView;

    @PropertyId("fullName")
    private TextField name = new TextField("Name");
    private ComboBox <Degree>degree = new ComboBox<>("Degree");

    private Button save = new Button("Save");
    private Button delete = new Button("Delete");
    private Binder <EmployeeDto>binder = new Binder<>(EmployeeDto.class);

    public EmployeeForm(EmployeesView employeeView){

        degree.setItems(Degree.values());
        HorizontalLayout buttons = new HorizontalLayout(save, delete);
        save.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        add(name, degree, buttons);

        binder.bindInstanceFields(this);

        save.addClickListener(event -> save());
        delete.addClickListener(event -> delete());
        this.employeeView = employeeView;
    }

    private void save() {
        EmployeeDto employeeDto = binder.getBean();
        employeeService.createEmployee(employeeDto);
        employeeView.refresh();
        setEmployee(null);
    }

    private void delete() {
        EmployeeDto employeeDto = binder.getBean();
        employeeService.deleteEmployee(employeeDto.getEmployeeId());
        employeeView.refresh();
        setEmployee(null);
    }

    public void setEmployee(EmployeeDto employee) {
        binder.setBean(employee);

        if (employee == null) {
            setVisible(false);
        } else {
            setVisible(true);
            name.focus();
        }
    }
}
