package com.example.backend.service;

import com.example.backend.model.User;
import com.example.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository repository;



    public void register(User user) {
        try {
            this.repository.save(user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Optional<User> auth(User user) {
        Optional<User> userOptional = repository.findByEmail(user.getEmail());
        if(userOptional.isPresent()){
            if(user.getPassword().equals(userOptional.get().getPassword())){
                return userOptional;
            }else{
                return null;
            }
        }else{
            return null;
        }
    }

}
