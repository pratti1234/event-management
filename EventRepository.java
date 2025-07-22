package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demo.model.Event;

public interface EventRepository extends MongoRepository<Event, String> {
}
