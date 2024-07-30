package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

@Controller
public class PersonController {
    @Autowired
	private PersonService personService;
	
	@GetMapping("/")
	public String listPersons(Model model) {
		model.addAttribute("persons", personService.findAll());
		return "index";
		
	}
	@GetMapping("/add")
	public String showAddForm(Model model) {
		model.addAttribute("person", new Person());
		return "add-person";	
	}
	
	@PostMapping("/add")
	public String addPerson (@ModelAttribute Person person) {
		personService.save(person);
		return "redirect:/";
		
	}
}
