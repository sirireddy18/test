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
    Employee emp2 = new Employee(2, "Siri",15000, 4000, 3000, 500);
    Employee emp3 = new Employee(3, "Sravani",6000, 7000, 300, 500);
    Employee emp4 = new Employee(4, "Sushma",8000, 1000, 300, 500);
    Employee emp5 = new Employee(5, "Spandana",9000, 500, 300, 500);
    employeeRepository.save(emp1);
    employeeRepository.save(emp2);
    employeeRepository.save(emp3);
    employeeRepository.save(emp4);
    employeeRepository.save(emp5);
    	}

}
