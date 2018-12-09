package com.hcc.advweb;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;
	
	public StudentServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@Transactional
	public void addStudent(Student student) {
		studentDAO.addStudent(student);		
	}

	@Override
	@Transactional
	public ArrayList<Student> getStudentsList() {
		return studentDAO.getStudentsList();
	}

	@Override
	@Transactional
	public Student getStudent(int Id) {
		return studentDAO.getStudent(Id);
	}

	@Override
	@Transactional
	public Student updateStudent(Student student) {
		return studentDAO.updateStudent(student);
	}
	
	

}
