package com.example.backend.controller;

import com.example.backend.model.User;
import com.example.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserService service;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        this.service.register(user);
        return "usuario cadastrado";
    }


    @PostMapping("/login")
    public void login(@RequestBody User user){
        Optional<User> a = service.auth(user);


    }
}
