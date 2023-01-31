package com.example.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.std.service"})
@EntityScan("com.example.std.rest")
public class StudentCrudMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentCrudMappingApplication.class, args);
	}

}
