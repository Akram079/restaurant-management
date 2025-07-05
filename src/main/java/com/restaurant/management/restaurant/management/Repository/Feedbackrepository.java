package com.restaurant.management.restaurant.management.Repository;

import com.restaurant.management.restaurant.management.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Feedbackrepository extends JpaRepository<Feedback, Integer> {
}
