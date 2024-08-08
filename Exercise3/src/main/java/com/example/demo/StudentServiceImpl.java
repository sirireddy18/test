package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

	@Override
	public List<Student> getStudents() {
		List<Student> students= new ArrayList<>();
		students.add(new Student("Siri","Madhukar", "18-03-2000", "Female"));
		students.add(new Student("Sravani","Prajwal", "9-03-2000", "Female"));
		return students;
	}

}
