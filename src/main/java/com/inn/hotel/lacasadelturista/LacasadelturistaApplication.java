package com.inn.hotel.lacasadelturista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LacasadelturistaApplication {

	@GetMapping("/message")

	public String message(){
		return "Welcome from Java to Azure";
	}

	public static void main(String[] args) {
		SpringApplication.run(LacasadelturistaApplication.class, args);
	}

}
