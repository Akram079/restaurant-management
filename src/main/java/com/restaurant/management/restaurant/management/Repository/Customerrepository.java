package com.restaurant.management.restaurant.management.Repository;

import com.restaurant.management.restaurant.management.entity.Customer;
import com.restaurant.management.restaurant.management.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Customerrepository extends JpaRepository<Customer, Integer> {
}
