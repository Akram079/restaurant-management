package com.restaurant.management.restaurant.management.Repository;

import com.restaurant.management.restaurant.management.entity.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemrepository extends JpaRepository<MenuItem, Integer> {
}
