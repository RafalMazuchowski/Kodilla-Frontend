package com.kodilla.frontend.services;

import com.kodilla.frontend.MainView;
import com.kodilla.frontend.models.EmployeeDto;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeService {

    private static final String API_EMPLOYEE = MainView.BASE_API_URL + "v1/employee";
    private static EmployeeService employeeService;
    private RestTemplate restTemplate = new RestTemplate();


    public static EmployeeService getInstance() {
        if (employeeService == null) {
            employeeService = new EmployeeService();
        }
        return employeeService;
    }

    public List<EmployeeDto> fetchEmployees() {
        String url = API_EMPLOYEE + "/all";
        EmployeeDto[] employeeDtos = restTemplate.getForObject(url, EmployeeDto[].class);
        if (employeeDtos != null) {
            return Arrays.asList(employeeDtos);
        } else {
            return new ArrayList<>();
        }
    }

    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        String url = API_EMPLOYEE + "/add";
        return restTemplate.postForObject(url, employeeDto, EmployeeDto.class);
    }

    public void deleteEmployee(Long id) {
        String url = API_EMPLOYEE + "/delete/" + id;
        restTemplate.delete(url);
    }
}
