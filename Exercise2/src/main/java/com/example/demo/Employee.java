package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int basic;
	private int hra;
	private int da;
	private int deductions;
	
	public Employee() {
	}
	public Employee(int id, String name, int basic, int hra, int da, int deductions) {
		super();
		this.id = (long) id;
		this.name = name;
		this.basic = basic;
		this.hra = hra;
		this.da = da;
		this.deductions = deductions;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public int getDa() {
		return da;
	}
	public void setDa(int da) {
		this.da = da;
	}
	public int getDeductions() {
		return deductions;
	}
	public void setDeductions(int deductions) {
		this.deductions = deductions;
	}
}
