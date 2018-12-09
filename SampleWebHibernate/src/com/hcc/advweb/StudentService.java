package com.hcc.advweb;

import java.util.ArrayList;

public interface StudentService {

	
	public void addStudent(Student student);
	
	public Student getStudent(int Id);
	
	public ArrayList<Student> getStudentsList();
	
	public Student updateStudent(Student student);
	
}
