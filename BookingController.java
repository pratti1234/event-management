package com.example.demo.controller;

import com.example.demo.model.Booking;
import com.example.demo.repository.BookingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class BookingController {

    @Autowired
    private BookingRepository bookingRepo;

    // Book an event
    @PostMapping("/book")
    public String bookEvent(@RequestBody Booking booking) {
        bookingRepo.save(booking);  // This line requires bookingRepo to be correct!
        return "Booking successful!";
    }

    // View booked events
    @GetMapping("/bookings/{username}")
    public List<Booking> getUserBookings(@PathVariable String username) {
        return bookingRepo.findByUsername(username);
    }
}
