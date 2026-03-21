package com.example.backend.model;

import jakarta.persistence.*;

import java.time.LocalTime;
import java.util.List;

@Entity
public class Barber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @OneToMany(mappedBy = "barber")
    private List<ServiceOffering> services;
    private LocalTime serviceStartTime;
    private LocalTime serviceEndTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<ServiceOffering> getServices() {
        return services;
    }

    public void setServices(List<ServiceOffering> services) {
        this.services = services;
    }

    public LocalTime getServiceStartTime() {
        return serviceStartTime;
    }

    public void setServiceStartTime(LocalTime serviceStartTime) {
        this.serviceStartTime = serviceStartTime;
    }

    public LocalTime getServiceEndTime() {
        return serviceEndTime;
    }

    public void setServiceEndTime(LocalTime serviceEndTime) {
        this.serviceEndTime = serviceEndTime;
    }
}
