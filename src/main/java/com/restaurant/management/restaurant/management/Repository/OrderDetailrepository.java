package com.restaurant.management.restaurant.management.Repository;

import com.restaurant.management.restaurant.management.entity.Order;
import com.restaurant.management.restaurant.management.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailrepository extends JpaRepository<OrderDetail, Integer> {
}
