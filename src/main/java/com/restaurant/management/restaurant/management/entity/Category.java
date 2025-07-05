package com.restaurant.management.restaurant.management.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String categoryName;


@OneToMany(mappedBy = "category")
    private List<MenuItem> menuItems = new ArrayList<MenuItem>();



}
