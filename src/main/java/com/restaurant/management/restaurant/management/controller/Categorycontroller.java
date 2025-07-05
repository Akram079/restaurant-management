package com.restaurant.management.restaurant.management.controller;

import com.restaurant.management.restaurant.management.DTO.CategoryDTO;
import com.restaurant.management.restaurant.management.service.Categoryservice;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/categories")
public class Categorycontroller {

    private final Categoryservice categoryservice;

    @PostMapping
    public void createCategory(@RequestBody CategoryDTO dto) {
        categoryservice.createCategory(dto);
    }

    @GetMapping
    public List<CategoryDTO> getAllCategories() {
        return categoryservice.getAllCategories();
    }
}
