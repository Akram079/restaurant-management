package com.restaurant.management.restaurant.management.service;

import com.restaurant.management.restaurant.management.DTO.FeedbackDTO;
import com.restaurant.management.restaurant.management.entity.Feedback;
import com.restaurant.management.restaurant.management.Repository.Feedbackrepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class Feedbackservice {

    private final Feedbackrepository feedbackrepository;

    public void createFeedback(FeedbackDTO dto) {
        Feedback feedback = new Feedback();
        feedback.setRating(dto.getRating());
        feedback.setComment(dto.getComment());
        feedbackrepository.save(feedback);
    }

    public void updateFeedback(int id, FeedbackDTO dto) {
        Optional<Feedback> optional = feedbackrepository.findById(id);
        if (optional.isPresent()) {
            Feedback feedback = optional.get();
            feedback.setRating(dto.getRating());
            feedback.setComment(dto.getComment());
            feedbackrepository.save(feedback);
        }
    }

    public void deleteFeedback(int id) {
        feedbackrepository.deleteById(id);
    }
}
