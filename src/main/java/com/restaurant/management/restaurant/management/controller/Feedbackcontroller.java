package com.restaurant.management.restaurant.management.controller;

import com.restaurant.management.restaurant.management.DTO.FeedbackDTO;
import com.restaurant.management.restaurant.management.service.Feedbackservice;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/feedbacks")
public class Feedbackcontroller {

    private final Feedbackservice feedbackservice;

    @PostMapping
    public void createFeedback(@RequestBody FeedbackDTO dto) {
        feedbackservice.createFeedback(dto);
    }

    @PutMapping("/{id}")
    public void updateFeedback(@PathVariable int id, @RequestBody FeedbackDTO dto) {
        feedbackservice.updateFeedback(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteFeedback(@PathVariable int id) {
        feedbackservice.deleteFeedback(id);
    }
}
