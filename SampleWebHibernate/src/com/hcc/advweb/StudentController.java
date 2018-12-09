package com.hcc.advweb;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller				// INSTEAD OF Controller, you put RestController to make the application web  http: accessible
@RequestMapping
public class StudentController 
{

	@Autowired
	private StudentService studentService;
	
	public StudentController() 
	{
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping(value="/studentslist", method= RequestMethod.GET)
	public ModelAndView getStudentsList(ModelAndView model) {
		ArrayList<Student> studentsList = studentService.getStudentsList();
		model.addObject("studentsList",studentsList);
		model.setViewName("studentslist");
		return model;
	}

	@RequestMapping(value="/newspringstudent",method=RequestMethod.GET)
	public ModelAndView newSpringStudent(ModelAndView modelView) {
		Student student = new Student();
		modelView.addObject("student",student);
		modelView.setViewName("addnewstudent");
		return modelView;
	}
	
	@RequestMapping(value="/addspringstudent", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView addSpringStudent(@ModelAttribute Student student) {
		System.out.println("----------");
		if (student.getId() == 0) {
			studentService.addStudent(student);
		} else {
			studentService.updateStudent(student);
		}
		ArrayList<Student> studentsList = studentService.getStudentsList();

		return new ModelAndView("studentslist","studentsList",studentsList);
	}
	
	
}
