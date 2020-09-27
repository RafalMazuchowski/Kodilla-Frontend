package com.kodilla.frontend.models;

import java.sql.Date;

public class CarDto {
    private Long carId;
    private String manufacturer;
    private String model;
    private Boolean borrowed;
    private Date rentDate;

    public CarDto(Long carId, String manufacturer, String model, Boolean borrowed, Date rentDate) {
        this.carId = carId;
        this.manufacturer = manufacturer;
        this.model = model;
        this.borrowed = borrowed;
        this.rentDate = rentDate;
    }

    public CarDto() {
    }

    public Long getCarId() {
        return carId;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Boolean getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(Boolean borrowed) {
        this.borrowed = borrowed;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }
}
