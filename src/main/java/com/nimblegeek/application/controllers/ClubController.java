package com.nimblegeek.application.controllers;

import com.nimblegeek.application.entities.Club;
import com.nimblegeek.application.repositories.ClubRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClubController {

    // standard constructors

    private final ClubRepository clubRepository;

    public ClubController(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @GetMapping("/clubs")
    public List<Club> getClubs() {
        return (List<Club>) clubRepository.findAll();
    }

    @PostMapping("/clubs")
    void addClub(@RequestBody Club club) {
        clubRepository.save(club);
    }
}
