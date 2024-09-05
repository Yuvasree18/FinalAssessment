package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class YuvasreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(YuvasreeApplication.class, args);
	}
	
	@GetMapping("/students")
	public String studentInfo() {

		return "Student details are displayed ";
	}
	
	
	@GetMapping("/teachers")
	public String teacherInfo() {

		return "Teacher details are displayed ";
	}
	
	
	@GetMapping("/admins")
	public String adminInfo() {
		return "Admin details are displayed ";
	}

}
