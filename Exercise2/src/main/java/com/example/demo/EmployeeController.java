package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@GetMapping("/{name}")
	public String getEmployeeSalary(@PathVariable String name) {
		Employee employee= employeeService.getEmployeeByName(name);
		if (employee==null) {
		return "Employee not found";
		}
		
		double netSalary= employeeService.computeNetSalary(employee);
		return "Net salary of " + name + " is :  " + netSalary;
		
	}
	
}
