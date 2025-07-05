package com.restaurant.management.restaurant.management.DTO;

import lombok.Data;

@Data
public class BillDTO {
    private int id;

    private double amount;
    private double TotalPayable;
}
