package com.restaurant.management.restaurant.management.controller;

import com.restaurant.management.restaurant.management.DTO.ReservationDTO;
import com.restaurant.management.restaurant.management.service.Reservationservice;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservations")
public class Reservationcontroller {

    private final Reservationservice reservationservice;

    @PostMapping
    public void createReservation(@RequestBody ReservationDTO reservationDTO) {
        reservationservice.createReservation(reservationDTO);
    }

    @GetMapping
    public List<ReservationDTO> getAllReservations() {
        return reservationservice.getAllReservations();
    }
}
