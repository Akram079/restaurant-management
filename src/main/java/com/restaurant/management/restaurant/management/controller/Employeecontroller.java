package com.restaurant.management.restaurant.management.controller;

import com.restaurant.management.restaurant.management.DTO.EmployeeDTO;
import com.restaurant.management.restaurant.management.service.Employeeservice;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class Employeecontroller {

    private Employeeservice employeeservice;

    @PostMapping("/create_emp")
    public void createEMp(@RequestBody EmployeeDTO employeeDTO) {
        employeeservice.createEmp(employeeDTO);
    }
}
