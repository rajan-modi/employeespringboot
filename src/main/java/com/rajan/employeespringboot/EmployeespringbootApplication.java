package com.rajan.employeespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeespringbootApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee API");
		SpringApplication.run(EmployeespringbootApplication.class, args);
	}
}
