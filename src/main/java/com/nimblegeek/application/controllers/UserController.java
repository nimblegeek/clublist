package com.nimblegeek.application.controllers;

import com.nimblegeek.application.entities.Club;
import com.nimblegeek.application.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    // standard constructors

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<Club> getUsers() {
        return (List<Club>) userRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody Club club) {
        userRepository.save(club);
    }
}
