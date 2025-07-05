package com.restaurant.management.restaurant.management.Repository;

import com.restaurant.management.restaurant.management.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Reservationrepository extends JpaRepository<Reservation, Integer> {
}
