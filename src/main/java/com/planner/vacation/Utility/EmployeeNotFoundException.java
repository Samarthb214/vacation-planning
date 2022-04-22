package com.planner.vacation.utility;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long exception) {
        super(String.valueOf(exception));
    }
}