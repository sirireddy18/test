package com.example.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class Prototype {

	public void Task2() {
		System.out.println("performing task2");
	}
}
