package com.hcc.advweb;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class SpringTestController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String viewStudentDetails(ModelMap model) {
	    model.addAttribute("greetings", "Hi, I am Spring Framework, Glad to meet you :) !!!!");
	    return "hello";
	}
	
	@RequestMapping(value = "/fine", method = RequestMethod.GET)
	public String viewStudentDetails2(ModelMap model) {
		System.out.println("-----------Came inside my controller ----------");
	    model.addAttribute("greetingsFine", "I am doing Fine Excellent, THanks !!!!");
	    return "fine";
	}
	
/*	
	@RequestMapping(value = "/studentslist", method = RequestMethod.GET)
	public ModelAndView viewStudentList() {
		//System.out.println("-----------Came inside my controller for picking up students list ----------");
	    ArrayList<Student> studentsList = StudentsList.getStudentsList();
	    
	    return new ModelAndView("studentslist","studentsList", studentsList);
	}
*/	
	@RequestMapping(value = "/getstudentdetails", method = RequestMethod.GET)
	public ModelAndView getStudentDetail(@RequestParam(name = "id") String studentId) {
		System.out.println("---------Here is my ID from the form text box -------"+studentId);
	    ArrayList<Student> studentsList = StudentsList.getStudentsList();
	    Student thisStudent = null;
	    for (Student student:studentsList) {
	    	if (student.getId() == Integer.parseInt(studentId)) {
	    		thisStudent = student;
	    	}
	    }
	    return new ModelAndView("getstudentdetails","studentDetails",thisStudent);
	    
	}
	
	@RequestMapping(value = "/addnewstudent2", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView addNewStudent(@RequestParam(name = "id") String studentId,
			@RequestParam(name = "fname") String fName,
			@RequestParam(name = "lname") String lName
			) {
		System.out.println("---------Here is all the info for adding this student -------"+
			studentId + "," + fName + "," + lName );
		// Create a new student and add the new student to the list
		Student student = new Student(Integer.parseInt(studentId), fName, lName);

		// get the latest student list and set the model with the list
		ArrayList<Student> studentsList = StudentsList.addStudent(student);
		
	    return new ModelAndView("studentslist","studentsList",studentsList);
	}
	
	
	
}
