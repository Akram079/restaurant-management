package com.restaurant.management.restaurant.management.service;

import com.restaurant.management.restaurant.management.DTO.ReservationDTO;
import com.restaurant.management.restaurant.management.entity.Reservation;
import com.restaurant.management.restaurant.management.Repository.Reservationrepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class Reservationservice {

    private final Reservationrepository reservationrepository;

    public void createReservation(ReservationDTO reservationDTO) {
        Reservation reservation = new Reservation();
        reservation.setReservationDate(reservationDTO.getReservationDate());
        reservation.setTimeSlot(reservationDTO.getTimeSlot());
        reservation.setStatus(reservationDTO.getStatus());
        reservationrepository.save(reservation);
    }

    public List<ReservationDTO> getAllReservations() {
        return reservationrepository.findAll()
                .stream()
                .map(reservation -> {
                    ReservationDTO dto = new ReservationDTO();
                    dto.setId(reservation.getId());
                    dto.setReservationDate(reservation.getReservationDate());
                    dto.setTimeSlot(reservation.getTimeSlot());
                    dto.setStatus(reservation.getStatus());
                    return dto;
                })
                .collect(Collectors.toList());
    }
}
