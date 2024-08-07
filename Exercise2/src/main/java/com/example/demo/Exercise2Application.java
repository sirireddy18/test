package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercise2Application implements CommandLineRunner {
	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(Exercise2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
    Employee emp1 = new Employee(1, "John Marquee",5000, 440, 300, 500);
    
    employeeRepository.save(emp1);	}

}
