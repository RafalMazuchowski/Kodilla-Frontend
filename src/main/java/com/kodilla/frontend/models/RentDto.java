package com.kodilla.frontend.models;

public class RentDto {
    private Long rentId;
    private Long borrowerId;
    private Long carId;
    private Integer distance;
    private String placeOfRent;
    private String placeOfReturn;
    private Boolean carReturned;
    private Integer price;

    public RentDto() {
    }

    public RentDto(Long rentId, Long borrowerId, Long carId, Integer distance, String placeOfRent, String placeOfReturn, Boolean carReturned, Integer price) {
        this.rentId = rentId;
        this.borrowerId = borrowerId;
        this.carId = carId;
        this.distance = distance;
        this.placeOfRent = placeOfRent;
        this.placeOfReturn = placeOfReturn;
        this.carReturned = carReturned;
        this.price = price;
    }

    public Long getRentId() {
        return rentId;
    }

    public Long getBorrowerId() {
        return borrowerId;
    }

    public Long getCarId() {
        return carId;
    }

    public Integer getDistance() {
        return distance;
    }

    public String getPlaceOfRent() {
        return placeOfRent;
    }

    public String getPlaceOfReturn() {
        return placeOfReturn;
    }

    public Boolean getCarReturned() {
        return carReturned;
    }

    public Integer getPrice() {
        return price;
    }
}
