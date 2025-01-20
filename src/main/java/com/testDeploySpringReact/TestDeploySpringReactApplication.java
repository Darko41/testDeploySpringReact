package com.testDeploySpringReact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestDeploySpringReactApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestDeploySpringReactApplication.class, args);
	}

	@GetMapping("/")
	public String hello(@RequestParam(value = "name", defaultValue = "Biciz :)") String name) {
		return String.format("Whats up %s!", name);
	}
	
}
