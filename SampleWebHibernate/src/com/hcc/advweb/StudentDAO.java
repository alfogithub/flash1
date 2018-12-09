package com.hcc.advweb;

import java.util.ArrayList;

public interface StudentDAO {

	public void addStudent(Student student);
	
	public ArrayList<Student> getStudentsList();
	
	public Student getStudent(int Id);
	
	public Student updateStudent(Student student);

}
