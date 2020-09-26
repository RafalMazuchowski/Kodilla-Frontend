package com.kodilla.frontend.models;

public class RentDto {
    private Long rentId;
    private Long borrowerId;
    private Long carId;
    private Integer distance;
    private Rental placeOfRent;
    private Rental placeOfReturn;
    private Boolean carReturned;
    private Integer price;

    public RentDto() {
    }

    public RentDto(Long rentId, Long borrowerId, Long carId, Integer distance,
                   Rental placeOfRent, Rental placeOfReturn, Boolean carReturned, Integer price) {
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

    public Rental getPlaceOfRent() {
        return placeOfRent;
    }

    public Rental getPlaceOfReturn() {
        return placeOfReturn;
    }

    public Boolean getCarReturned() {
        return carReturned;
    }

    public Integer getPrice() {
        return price;
    }

    public void setBorrowerId(Long borrowerId) {
        this.borrowerId = borrowerId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public void setPlaceOfRent(Rental placeOfRent) {
        this.placeOfRent = placeOfRent;
    }

    public void setPlaceOfReturn(Rental placeOfReturn) {
        this.placeOfReturn = placeOfReturn;
    }

    public void setCarReturned(Boolean carReturned) {
        this.carReturned = carReturned;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
