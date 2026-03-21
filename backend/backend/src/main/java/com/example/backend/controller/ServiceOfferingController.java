package com.example.backend.controller;

import com.example.backend.model.ServiceOffering;
import com.example.backend.service.ServiceOfferingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ServiceOfferingController {

    @Autowired
    ServiceOfferingService service;

    @PostMapping("/services")
    public String registerService(@RequestBody ServiceOffering serviceOffering){
        service.registerService(serviceOffering);
        return "serviço cadastrado";
    }

    /*@GetMapping("/services")
    public ServiceOffering getServices(){
        return service.getSErvices();
    }

     */
}
