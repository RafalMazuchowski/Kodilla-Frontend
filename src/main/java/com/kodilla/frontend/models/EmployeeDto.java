package com.kodilla.frontend.models;


public class EmployeeDto {
    private Long employeeId;
    private String fullName;
    private Degree degree;

    public EmployeeDto(Long employeeId, String fullName, Degree degree) {
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

    public Degree getDegree() {
        return degree;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }
}
