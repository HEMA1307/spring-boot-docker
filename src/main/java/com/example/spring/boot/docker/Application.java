package com.example.spring.boot.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Application {
	
	@GetMapping("/displayMessage")
	public String displayMessage() {
		//System.out.println("Successfully dockerzised");
		return "Done..Successfully dockerzised...";
		
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
