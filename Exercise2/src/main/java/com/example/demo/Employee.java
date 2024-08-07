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
	
	public Employee(int i, String string, int j, int k, int l, int m) {
		// TODO Auto-generated constructor stub
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
