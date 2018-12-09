package com.hcc.advweb;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.SessionFactory;

@Repository
public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public StudentDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addStudent(Student student) {
		sessionFactory.getCurrentSession().saveOrUpdate(student);
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Student> getStudentsList() {
		ArrayList<Student> studentsList = 
				(ArrayList<Student>)sessionFactory.
				getCurrentSession().createQuery("FROM Student").
				list();
		return studentsList;
	}

	@Override
	public Student getStudent(int Id) {
		Student student = (Student)sessionFactory.getCurrentSession().get(Student.class, Id);
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		
		return null;
	}

}
