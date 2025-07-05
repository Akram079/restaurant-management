package com.restaurant.management.restaurant.management.Repository;

import com.restaurant.management.restaurant.management.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Billrepository  extends JpaRepository<Bill, Integer> {
}
