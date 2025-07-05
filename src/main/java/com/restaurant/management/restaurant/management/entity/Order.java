package com.restaurant.management.restaurant.management.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String status;
    private float amount;
    private String orderdate;



    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;


    @OneToOne(mappedBy = "order")
    private Bill bill;


    @ManyToOne
    @JoinColumn(name = "table_id")
    private Table table;

    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetails=new ArrayList<>();

}
