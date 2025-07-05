package com.restaurant.management.restaurant.management.DTO;

import lombok.Data;

@Data
public class OrderDTO {
    private int id;
    private String status;
    private float amount;
    private String orderdate;

}
