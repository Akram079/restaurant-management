package com.restaurant.management.restaurant.management.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String email;
    private String contact;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders = new ArrayList<Order>();


    @OneToMany(mappedBy = "customer")
    private List<Feedback> feedbacks = new ArrayList<>();

    @OneToMany(mappedBy = "customer")
    private  List<Reservation> reservations = new ArrayList<>();


}
