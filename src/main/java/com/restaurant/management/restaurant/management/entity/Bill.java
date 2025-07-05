package com.restaurant.management.restaurant.management.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double amount;
    private double TotalPayable;


    @OneToOne
    @JoinColumn(name="order_id")
    private Order order;

}
