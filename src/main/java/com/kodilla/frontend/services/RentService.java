package com.kodilla.frontend.services;

import com.kodilla.frontend.MainView;
import com.kodilla.frontend.models.RentDto;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RentService {

    private static final String API_EMPLOYEE = MainView.BASE_API_URL + "v1/rent";
    private static RentService rentService;
    private RestTemplate restTemplate = new RestTemplate();


    public static RentService getInstance() {
        if (rentService == null) {
            rentService = new RentService();
        }
        return rentService;
    }

    public List<RentDto> fetchRents() {
        String url = API_EMPLOYEE + "/all";
        RentDto[] rentDtos = restTemplate.getForObject(url, RentDto[].class);
        if (rentDtos != null) {
            return Arrays.asList(rentDtos);
        } else {
            return new ArrayList<>();
        }
    }

    public RentDto createRent(RentDto rentDto) {
        String url = API_EMPLOYEE + "/add";
        return restTemplate.postForObject(url, rentDto, RentDto.class);
    }

    public void deleteRent(Long id) {
        String url = API_EMPLOYEE + "/delete/" + id;
        restTemplate.delete(url);
    }
}