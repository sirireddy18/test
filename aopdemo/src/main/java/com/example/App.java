package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.config.ProjectConfig;
import com.example.service.Prototype;
import com.example.service.Singleton;

public class App {
 
	public static void main(String[]args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(com.example.config.ProjectConfig.class);
		
		Singleton single1 =context.getBean(Singleton.class);
		single1.Task1();
		Singleton single2 =context.getBean(Singleton.class);
		single2.Task1();
		System.out.println("Are single1 and single2 same?" + (single1==single2));
		
		Prototype proto1= context.getBean(Prototype.class);
		proto1.Task2();
		Prototype proto2= context.getBean(Prototype.class);
		proto2.Task2();
		System.out.println("Are proto1 and proto2 same?" + (proto1==proto2));
	}
}
