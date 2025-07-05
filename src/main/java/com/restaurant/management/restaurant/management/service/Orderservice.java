package com.restaurant.management.restaurant.management.service;

import com.restaurant.management.restaurant.management.DTO.OrderDTO;
import com.restaurant.management.restaurant.management.entity.Order;
import com.restaurant.management.restaurant.management.Repository.Orderrepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class Orderservice {

    private final Orderrepository orderrepository;

    public void createOrder(OrderDTO orderDTO) {
        Order order = new Order();
        order.setStatus(orderDTO.getStatus());
        order.setAmount(orderDTO.getAmount());
        order.setOrderdate(orderDTO.getOrderdate());
        orderrepository.save(order);
    }

    public List<OrderDTO> getAllOrders() {
        return orderrepository.findAll()
                .stream()
                .map(order -> {
                    OrderDTO dto = new OrderDTO();
                    dto.setId(order.getId());
                    dto.setStatus(order.getStatus());
                    dto.setAmount(order.getAmount());
                    dto.setOrderdate(order.getOrderdate());
                    return dto;
                })
                .collect(Collectors.toList());
    }
}
