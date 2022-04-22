package com.planner.vacation.service;
import java.util.List;
import java.util.Optional;

import com.planner.vacation.utility.Employee;

public interface EmployeeService {

    List <Employee> findAll();

    void save(Employee employee);

    Optional <Employee> findById(Long id);

    void delete(long id);
}