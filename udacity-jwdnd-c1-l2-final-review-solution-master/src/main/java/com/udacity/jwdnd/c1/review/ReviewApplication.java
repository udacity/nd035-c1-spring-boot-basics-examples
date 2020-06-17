package com.udacity.jwdnd.c1.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}

	@Bean
	public String message() {
		System.out.println("Creating message bean");
		return "Hello, Spring!";
	}

	@Bean
	public String uppercaseMessage(MessageService messageService) {
		System.out.println("Creating uppercaseMessage bean");
		return messageService.uppercase();
	}

	@Bean
	public String lowercaseMessage(MessageService messageService) {
		System.out.println("Creating lowercaseMessage bean");
		return messageService.lowercase();
	}

}
