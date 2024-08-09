package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	public Student getStudentById(Long id) {
		return studentRepository.findById(id).orElse(null);
	}
   
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public void deleteStudent(Long Id) {
		studentRepository.deleteById(Id);
	}
	
}

