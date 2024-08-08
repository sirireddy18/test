package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee getEmployeeByName(String name) {
		return employeeRepository.findByName(name);
	}
	
	public double computeNetSalary(Employee employee) {
		double grossSalary=employee.getBasic()+ employee.getHra()+employee.getDa();
		double tax= grossSalary*0.15;
		double netSalary= grossSalary- (tax+employee.getDeductions());
		return netSalary;
	}

	
	

}
