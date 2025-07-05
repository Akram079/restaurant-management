package com.restaurant.management.restaurant.management.service;

import com.restaurant.management.restaurant.management.DTO.MenuItemDTO;
import com.restaurant.management.restaurant.management.entity.MenuItem;
import com.restaurant.management.restaurant.management.Repository.MenuItemrepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class MenuItemservice {

    private final MenuItemrepository menuItemrepository;

    public void createMenuItem(MenuItemDTO menuItemDTO) {
        MenuItem menuItem = new MenuItem();
        menuItem.setName(menuItemDTO.getName());
        menuItem.setDescription(menuItemDTO.getDescription());
        menuItem.setPrice(menuItemDTO.getPrice());
        menuItemrepository.save(menuItem);
    }

    public void updateMenuItem(int id, MenuItemDTO menuItemDTO) {
        Optional<MenuItem> optional = menuItemrepository.findById(id);
        if (optional.isPresent()) {
            MenuItem menuItem = optional.get();
            menuItem.setName(menuItemDTO.getName());
            menuItem.setDescription(menuItemDTO.getDescription());
            menuItem.setPrice(menuItemDTO.getPrice());
            menuItemrepository.save(menuItem);
        }
    }

    public void deleteMenuItem(int id) {
        menuItemrepository.deleteById(id);
    }
}
