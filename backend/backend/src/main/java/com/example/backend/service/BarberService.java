package com.example.backend.service;

import com.example.backend.model.Barber;
import com.example.backend.repository.BarberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BarberService {

    @Autowired
    BarberRepository repository;
    public void register(Barber barber) {
        try {
            repository.save(barber);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
