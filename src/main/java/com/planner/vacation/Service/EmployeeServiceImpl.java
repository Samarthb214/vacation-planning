package com.planner.vacation.service;

import java.util.List;
import java.util.Optional;

import com.planner.vacation.repository.EmployeeRepository;
import com.planner.vacation.utility.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Optional < Employee > findById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public List < Employee > findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void delete(long id) {
        employeeRepository.deleteById(id);
    }
}