package com.nimblegeek.application;

import com.nimblegeek.application.entities.Club;
import com.nimblegeek.application.repositories.ClubRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner init(ClubRepository clubRepository) {
		return args -> {
			Stream.of("Bålsta Dojo", "FrontLine Academy", "Nacka Dojo").forEach(name -> {
				Club club = new Club(name, name.toLowerCase() + "@domain.com");
				clubRepository.save(club);
			});
			clubRepository.findAll().forEach(System.out::println);
		};
	}
}