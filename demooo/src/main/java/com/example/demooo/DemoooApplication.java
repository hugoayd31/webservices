package com.example.demooo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoooApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoooApplication.class, args);
	}

	@GetMapping
	public List<String> hello(){
		return List.of("Hello", "Hello");
	}
}
