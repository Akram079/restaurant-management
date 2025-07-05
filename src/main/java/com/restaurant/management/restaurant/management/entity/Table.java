package com.restaurant.management.restaurant.management.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
public class Table {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int tableNumber;
    private int capacity;
    private String status;


    @OneToMany(mappedBy = "table")
    private List<Order> orders=new ArrayList<>();

    @OneToMany(mappedBy = "table")
    private List<Reservation> reservations=new ArrayList<>();

}
