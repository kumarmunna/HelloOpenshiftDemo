package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringHelloWorldForOpenShiftDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHelloWorldForOpenShiftDemoApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String getHelloMessage() {
		return "Hello World";
	}
	
	
	@GetMapping("/hello/{name}")
	public String getHelloMessage(@PathVariable("name") String name) {
		return "Welcome " + name +" on open shift deployment";
	}
	
	@GetMapping("/sayhello/{name}")
	public String sayHelloToGit(@PathVariable("name") String name) {
		return "Welcome to GIT and Jenkins deployement by " + name;
	}
}
