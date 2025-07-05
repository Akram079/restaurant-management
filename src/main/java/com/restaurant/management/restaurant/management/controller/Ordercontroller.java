package com.restaurant.management.restaurant.management.controller;

import com.restaurant.management.restaurant.management.DTO.OrderDTO;
import com.restaurant.management.restaurant.management.service.Orderservice;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/orders")
public class Ordercontroller {

    private final Orderservice orderservice;

    @PostMapping
    public void createOrder(@RequestBody OrderDTO orderDTO) {
        orderservice.createOrder(orderDTO);
    }

    @GetMapping
    public List<OrderDTO> getAllOrders() {
        return orderservice.getAllOrders();
    }
}
