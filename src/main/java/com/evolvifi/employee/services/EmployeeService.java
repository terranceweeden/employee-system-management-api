package com.evolvifi.employee.services;

import com.evolvifi.employee.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    boolean deleteEmployee(Long id);

    Employee getEmployeeById();

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);
}
