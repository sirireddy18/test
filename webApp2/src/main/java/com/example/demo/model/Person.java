package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;

@Entity
public class Person {
   @jakarta.persistence.Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	
	@NotEmpty(message="Name is Required")
	@Size(min=5, max=10, message= "Name must be between 5 and 10 characters")
	private String Name;
	
	@Email
	@NotEmpty(message="Email is required")
	private String Email;
	
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
}
