package com.docker.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HellodevoppsApplication {

	@GetMapping("/msg")
	public String getString() {
		return "Welcome to new year new place  !!";
	}
	public static void main(String[] args) {
		SpringApplication.run(HellodevoppsApplication.class, args);
	}

}
