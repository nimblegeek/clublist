package com.nimblegeek.application;

import com.nimblegeek.application.entities.Club;
import com.nimblegeek.application.repositories.UserRepository;

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
	CommandLineRunner init(UserRepository userRepository) {
		return args -> {
			Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
				Club club = new Club(name, name.toLowerCase() + "@domain.com");
				userRepository.save(club);
			});
			userRepository.findAll().forEach(System.out::println);
		};
	}
}