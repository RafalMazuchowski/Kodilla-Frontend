package com.kodilla.frontend.views;

import com.kodilla.frontend.models.RentDto;
import com.kodilla.frontend.models.Rental;
import com.kodilla.frontend.services.RentService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class RentsView extends VerticalLayout {
    private Grid<RentDto> grid = new Grid<>(RentDto.class);
    //private RentForm form = new RentForm(this);
    private Button addNewRent = new Button("Add new rent");

    private RentService rentService = RentService.getInstance();

    public RentsView() {
        addNewRent.addClickListener(e -> {
            grid.asSingleSelect().clear();
            //form.setEmployee(new EmployeeDto());
        });
        add(addNewRent);
        grid.setColumns("borrowerId", "carId", "distance", "placeOfRent", "placeOfReturn", "carReturned", "price");
        grid.setSizeFull();
        add(grid);
        setSizeFull();
        refresh();
    }

    public void refresh() {
        grid.setItems(rentService.fetchRents());
    }
}