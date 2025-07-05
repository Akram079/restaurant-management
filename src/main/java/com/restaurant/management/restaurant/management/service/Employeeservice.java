package com.restaurant.management.restaurant.management.service;

import com.restaurant.management.restaurant.management.DTO.EmployeeDTO;
import com.restaurant.management.restaurant.management.Repository.Employeerepository;
import com.restaurant.management.restaurant.management.entity.Employee;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Employeeservice {

    private Employeerepository employeerepository;

    public void createEmp(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
      employee.setName(employeeDTO.getName());
      employee.setSalary(employeeDTO.getSalary());
      employee.setRole(employeeDTO.getRole());

      employeerepository.save(employee);
    }
    



}
