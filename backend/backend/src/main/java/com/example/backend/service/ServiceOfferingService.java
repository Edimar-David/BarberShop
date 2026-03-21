package com.example.backend.service;

import com.example.backend.model.ServiceOffering;
import com.example.backend.repository.ServiceOfferingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceOfferingService {

    @Autowired
    ServiceOfferingRepository repository;

    public void registerService(ServiceOffering serviceOffering) {
        try {
            repository.save(serviceOffering);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
