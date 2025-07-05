package com.restaurant.management.restaurant.management.service;

import com.restaurant.management.restaurant.management.DTO.CategoryDTO;
import com.restaurant.management.restaurant.management.entity.Category;
import com.restaurant.management.restaurant.management.Repository.Categoryrepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class Categoryservice {

    private final Categoryrepository categoryrepository;

    public void createCategory(CategoryDTO dto) {
        Category category = new Category();
        category.setCategoryName(dto.getCategoryName());
        categoryrepository.save(category);
    }

    public List<CategoryDTO> getAllCategories() {
        return categoryrepository.findAll()
                .stream()
                .map(category -> {
                    CategoryDTO dto = new CategoryDTO();
                    dto.setId(category.getId());
                    dto.setCategoryName(category.getCategoryName());
                    return dto;
                })
                .collect(Collectors.toList());
    }
}
