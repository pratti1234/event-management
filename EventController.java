package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Event;
import com.example.demo.repository.EventRepository;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class EventController {

    @Autowired
    private EventRepository eventRepo;

    @PostMapping("/add-event")
    public String addEvent(@RequestBody Event event) {
        eventRepo.save(event);
        return "Event added successfully!";
    }

    @GetMapping("/all")
    public List<Event> getAllEvents() {
        return eventRepo.findAll();
    }
}
