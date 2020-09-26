package com.kodilla.frontend.domain;


public class EmployeeDto {
    private Long employeeId;
    private String fullName;
    private String degree;

    public EmployeeDto(Long employeeId, String fullName, String degree) {
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.degree = degree;
    }

    public EmployeeDto() {
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDegree() {
        return degree;
    }
}
