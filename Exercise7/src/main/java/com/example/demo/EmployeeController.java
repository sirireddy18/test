package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.springframework.core.io.ClassPathResource;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
	private EmployeeRepository employeeRepository;
    
    
    /*
    @GetMapping
    public List<Employee> getAllEmployees(){
    	List<Employee> employees= employeeRepository.findAll();
    	System.out.println("Number of employees fetched:" + employees.size());
    	return employees;
    }
    
    */
    

    @GetMapping("/form")
    public String showEmployeeForm() throws IOException {
    	ClassPathResource htmlFile = new ClassPathResource ("static/employee_form.html");
    	return StreamUtils.copyToString(htmlFile.getInputStream(), StandardCharsets.UTF_8);
    }
    @PostMapping("/add")
    public Employee CreateEmployee( Employee employee) {
    	return employeeRepository.save(employee);
    }
}
