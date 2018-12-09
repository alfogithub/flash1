package com.hcc.advweb;

import java.util.ArrayList;

public class StudentsList {

	private static ArrayList<Student> studentsList;
	
	public static ArrayList<Student> getStudentsList() {
		if ((studentsList == null) || (studentsList.size() == 0)) {
			studentsList = new ArrayList<Student>();
			studentsList.add(new Student(1,"Raj","Joseph"));
			studentsList.add(new Student(2,"Jose","Gonzales"));
			studentsList.add(new Student(3,"Bob","Smith"));
			studentsList.add(new Student(4,"Adrian","Shah"));
			studentsList.add(new Student(5,"Kelly","Branco"));
		}
		System.out.println("Student List ---->"+studentsList);
		return studentsList;
	}
	public static void setStudentsList(ArrayList<Student> studentsList) {
		studentsList = studentsList;
	}

	public static ArrayList<Student> addStudent(Student student) {
		getStudentsList().add(student);
		return studentsList;
	}
	

}
