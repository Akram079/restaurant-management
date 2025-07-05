package com.restaurant.management.restaurant.management.controller;

import com.restaurant.management.restaurant.management.DTO.CustomerDTO;
import com.restaurant.management.restaurant.management.service.Customerservice;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class Customercontroller {

    private final Customerservice customerservice;

@PostMapping("/create_customer")
    public void saveCustomer(@RequestBody CustomerDTO customerDTO) {
        customerservice.createCustomer(customerDTO);
    }

    @GetMapping("/print_customer")
    public List<CustomerDTO> printCustomer() {
    return customerservice.getAllCustomers();
    }
}
