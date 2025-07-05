package com.restaurant.management.restaurant.management.Repository;

import com.restaurant.management.restaurant.management.entity.Category;
import com.restaurant.management.restaurant.management.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Categoryrepository extends JpaRepository<Category, Integer> {
}
