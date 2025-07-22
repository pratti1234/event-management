package com.example.demo.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demo.model.Booking;

public interface BookingRepository extends MongoRepository<Booking, String> {
    List<Booking> findByUsername(String username);
}
