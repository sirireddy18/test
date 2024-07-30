package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

import jakarta.validation.Valid;

public class PersonController {

	private PersonService personService;
	
	@GetMapping("/")
	public String listPersons(Model model) {
		model.addAttribute("persons", personService.findAll());
		return "index";
		
	}
	@GetMapping("/add")
	public String showaddForm(Model model) {
		model.addAttribute("person", new Person());
		return "add-Person";	
	}
	
	@PostMapping("/add")
	public String addPerson(@Valid @ModelAttribute("person") Person person, BindingResult result, Model model) {
    if(result.hasErrors()) {
    	return "add-person";
    }
		personService.save(person);
		return "redirect:/";
		
	}
}
