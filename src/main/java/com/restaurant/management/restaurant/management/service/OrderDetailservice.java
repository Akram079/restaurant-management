package com.restaurant.management.restaurant.management.service;

import com.restaurant.management.restaurant.management.DTO.OrderDetailDTO;
import com.restaurant.management.restaurant.management.entity.OrderDetail;
import com.restaurant.management.restaurant.management.Repository.OrderDetailrepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class OrderDetailservice {

    private final OrderDetailrepository orderDetailrepository;

    public void createOrderDetail(OrderDetailDTO dto) {
        OrderDetail detail = new OrderDetail();
        detail.setPrice(dto.getPrice());
        detail.setQuantity(dto.getQuantity());
        orderDetailrepository.save(detail);
    }

    public void updateOrderDetail(int id, OrderDetailDTO dto) {
        Optional<OrderDetail> optional = orderDetailrepository.findById(id);
        if (optional.isPresent()) {
            OrderDetail detail = optional.get();
            detail.setPrice(dto.getPrice());
            detail.setQuantity(dto.getQuantity());
            orderDetailrepository.save(detail);
        }
    }

    public void deleteOrderDetail(int id) {
        orderDetailrepository.deleteById(id);
    }
}
