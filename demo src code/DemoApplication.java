package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collections;
import java.util.List;

@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {
		
	     
		 SpringApplication app = new SpringApplication(DemoApplication.class);
	        app.setDefaultProperties(Collections
	          .singletonMap("server.port", "8083"));
	        app.run(args);
	}



}
