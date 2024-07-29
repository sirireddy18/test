package com.example.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class Singleton {

	public void Task1() {
		System.out.println("Performing task1");
	}
}
