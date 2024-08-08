package com.example.demo;

public class Student {

	private String StudentName;
	private String FatherName;
	private String DateOfBirth;
	private String Gender;
	
	public Student(String studentName, String fatherName, String dateOfBirth, String gender) {
		StudentName = studentName;
		FatherName = fatherName;
		DateOfBirth = dateOfBirth;
		Gender = gender;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getFatherName() {
		return FatherName;
	}
	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
}
