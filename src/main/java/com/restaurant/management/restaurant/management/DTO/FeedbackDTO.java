package com.restaurant.management.restaurant.management.DTO;

import lombok.Data;

@Data
public class FeedbackDTO {
    private int id;

    private  float rating;
    private String comment;
}
