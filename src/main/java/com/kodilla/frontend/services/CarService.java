package com.kodilla.frontend.services;

import com.kodilla.frontend.MainView;
import com.kodilla.frontend.models.CarDto;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarService {

    private static final String API_EMPLOYEE = MainView.BASE_API_URL + "v1/car";
    private static CarService carService;
    private RestTemplate restTemplate = new RestTemplate();



    public static CarService getInstance() {
        if (carService == null) {
            carService = new CarService();
        }
        return carService;
    }

    public List<CarDto> fetchCars() {
        String url = API_EMPLOYEE + "/all";
        CarDto[] carDtos = restTemplate.getForObject(url, CarDto[].class);
        if (carDtos != null) {
            return Arrays.asList(carDtos);
        } else {
            return new ArrayList<>();
        }
    }

    public CarDto createCar(CarDto carDto) {
        String url = API_EMPLOYEE + "/add";
        return restTemplate.postForObject(url, carDto, CarDto.class);
    }

    public void deleteCar(Long id) {
        String url = API_EMPLOYEE + "/delete/" + id;
        restTemplate.delete(url);
    }
}

