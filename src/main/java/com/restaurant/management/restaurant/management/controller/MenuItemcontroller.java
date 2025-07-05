package com.restaurant.management.restaurant.management.controller;

import com.restaurant.management.restaurant.management.DTO.MenuItemDTO;
import com.restaurant.management.restaurant.management.service.MenuItemservice;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/menu-items")
public class MenuItemcontroller {

    private final MenuItemservice menuItemservice;

    @PostMapping
    public void createMenuItem(@RequestBody MenuItemDTO menuItemDTO) {
        menuItemservice.createMenuItem(menuItemDTO);
    }

    @PutMapping("/{id}")
    public void updateMenuItem(@PathVariable int id, @RequestBody MenuItemDTO menuItemDTO) {
        menuItemservice.updateMenuItem(id, menuItemDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteMenuItem(@PathVariable int id) {
        menuItemservice.deleteMenuItem(id);
    }
}
