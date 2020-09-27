package com.kodilla.frontend.views;

import com.kodilla.frontend.models.CarDto;
import com.kodilla.frontend.services.CarService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class CarsView extends VerticalLayout {
    private Grid<CarDto> grid = new Grid<>(CarDto.class);
    private Button addNewCar = new Button("Add new car");

    private CarService carService = CarService.getInstance();

    public CarsView() {
        addNewCar.addClickListener(e -> {
            grid.asSingleSelect().clear();
        });
        add(addNewCar);
        grid.setColumns("manufacturer", "model", "borrowed", "rentDate");
        grid.setSizeFull();
        add(grid);
        setSizeFull();
        refresh();
    }

    public void refresh() {
        grid.setItems(carService.fetchCars());
    }
}