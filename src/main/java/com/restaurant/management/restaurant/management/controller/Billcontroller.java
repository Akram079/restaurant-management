package com.restaurant.management.restaurant.management.controller;

import com.restaurant.management.restaurant.management.DTO.BillDTO;
import com.restaurant.management.restaurant.management.service.Billservice;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/bills")
public class Billcontroller {

    private final Billservice billservice;

    @PostMapping
    public void createBill(@RequestBody BillDTO dto) {
        billservice.createBill(dto);
    }

    @PutMapping("/{id}")
    public void updateBill(@PathVariable int id, @RequestBody BillDTO dto) {
        billservice.updateBill(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteBill(@PathVariable int id) {
        billservice.deleteBill(id);
    }
}
