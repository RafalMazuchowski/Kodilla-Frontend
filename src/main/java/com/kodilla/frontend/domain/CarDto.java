package com.kodilla.frontend.domain;

import java.sql.Date;

public class CarDto {
    private Long carId;
    private Long modelId;
    private Boolean borrowed;
    private Date rentDate;

    public CarDto(Long carId, Long modelId, Boolean borrowed, Date rentDate) {
        this.carId = carId;
        this.modelId = modelId;
        this.borrowed = borrowed;
        this.rentDate = rentDate;
    }

    public CarDto() {
    }

    public Long getCarId() {
        return carId;
    }

    public Long getModelId() {
        return modelId;
    }

    public Boolean getBorrowed() {
        return borrowed;
    }

    public Date getRentDate() {
        return rentDate;
    }
}
