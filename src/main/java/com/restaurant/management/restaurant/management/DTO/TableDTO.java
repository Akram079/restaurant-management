package com.restaurant.management.restaurant.management.DTO;

import lombok.Data;

@Data
public class TableDTO {

    private int id;
    private int tableNumber;
    private int capacity;
    private String status;

}
