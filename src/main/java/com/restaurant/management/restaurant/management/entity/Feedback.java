package com.restaurant.management.restaurant.management.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private  float rating;
    private String comment;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}
