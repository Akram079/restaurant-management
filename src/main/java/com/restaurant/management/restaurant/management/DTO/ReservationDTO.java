package com.restaurant.management.restaurant.management.DTO;

import lombok.Data;

@Data
public class ReservationDTO {
    private int id;
    private String reservationDate;
    private String timeSlot;
    private String status;
}
