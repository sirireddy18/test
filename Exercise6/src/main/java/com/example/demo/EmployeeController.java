package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
	private EmployeeRepository employeeRepository;
    
    
    
    @GetMapping
    public List<Employee> getAllEmployees(){
    	List<Employee> employees= employeeRepository.findAll();
    	System.out.println("Number of employees fetched:" + employees.size());
    	return employees;
    }
    
    /*
    
    @PostMapping("/add")
    public Employee UpdateEmployee(@RequestBody Employee employee) {
    	return employeeRepository.save(employee);
    }

    @GetMapping("/employee/form")
    public String showEmployeeForm(Model model) {
    	return "employee";
    }
    */
}

