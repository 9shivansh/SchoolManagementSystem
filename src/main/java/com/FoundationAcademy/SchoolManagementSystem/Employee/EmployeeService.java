package com.FoundationAcademy.SchoolManagementSystem.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Optional<Employee> getEmployeeDetails(int employeeId) {
        Optional<Employee> employee = employeeRepository.findEmployeeByeNumber(employeeId);
        if(employee.isEmpty()) {
            return null;
        }
        return employee;
    }
}
