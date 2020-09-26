package com.kodilla.frontend.domain;

import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeService {

    private static EmployeeService employeeService;
    private RestTemplate restTemplate = new RestTemplate();

    public static EmployeeService getInstance() {
        if (employeeService == null) {
            employeeService = new EmployeeService();
        }
        return employeeService;
    }

    public List<EmployeeDto> fetchEmployees() {
        String url = "http://localhost:8080/v1/employee/all";
        EmployeeDto[] employeeDtos = restTemplate.getForObject(url, EmployeeDto[].class);
        if (employeeDtos != null) {
            return Arrays.asList(employeeDtos);
        } else {
            return new ArrayList<>();
        }
    }
}
