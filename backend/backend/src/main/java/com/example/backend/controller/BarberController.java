package com.example.backend.controller;

import com.example.backend.model.Barber;
import com.example.backend.service.BarberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class BarberController {

    @Autowired
    BarberService service;

    @PostMapping("/barber/register")
    public String register(@RequestBody Barber barber){
        service.register(barber);
        return "sucesso";
    }
}
