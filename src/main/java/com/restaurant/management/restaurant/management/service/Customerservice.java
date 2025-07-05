package com.restaurant.management.restaurant.management.service;

import com.restaurant.management.restaurant.management.DTO.CustomerDTO;
import com.restaurant.management.restaurant.management.Repository.Customerrepository;
import com.restaurant.management.restaurant.management.entity.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class Customerservice {

    private Customerrepository customerrepository;

public void createCustomer(CustomerDTO customerDTO) {
    Customer customer = new Customer();
    customer.setName(customerDTO.getName());
    customer.setEmail(customerDTO.getEmail());
    customer.setContact(customerDTO.getContact());

    customerrepository.save(customer);
}

public List<CustomerDTO> getAllCustomers() {
   List<Customer> customers = customerrepository.findAll();
   List<CustomerDTO> customerDTOs = new ArrayList<>();
   for (Customer customer : customers) {
       CustomerDTO customerDTO = new CustomerDTO();
       customerDTO.setName(customer.getName());
       customerDTO.setEmail(customer.getEmail());
       customerDTO.setContact(customer.getContact());
       customerDTOs.add(customerDTO);
   }
   return customerDTOs;

}

}
