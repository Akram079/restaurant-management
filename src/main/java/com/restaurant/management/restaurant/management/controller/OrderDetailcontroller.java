package com.restaurant.management.restaurant.management.controller;

import com.restaurant.management.restaurant.management.DTO.OrderDetailDTO;
import com.restaurant.management.restaurant.management.service.OrderDetailservice;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/order-details")
public class OrderDetailcontroller {

    private final OrderDetailservice orderDetailservice;

    @PostMapping
    public void createOrderDetail(@RequestBody OrderDetailDTO dto) {
        orderDetailservice.createOrderDetail(dto);
    }

    @PutMapping("/{id}")
    public void updateOrderDetail(@PathVariable int id, @RequestBody OrderDetailDTO dto) {
        orderDetailservice.updateOrderDetail(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteOrderDetail(@PathVariable int id) {
        orderDetailservice.deleteOrderDetail(id);
    }
}
