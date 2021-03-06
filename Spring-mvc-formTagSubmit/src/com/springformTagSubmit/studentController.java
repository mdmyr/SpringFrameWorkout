package com.springformTagSubmit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/forms") // this is the main head
public class studentController {
		@RequestMapping("/showStudentForm")
		public String studentForm(Model theStudentModel) {
			//this is the model shown in the view page.
			
			//2step process to the object in the model.
			
			//get the student model 
			// this object name is the modelAttribute to the view **** very import**
			student aStudent = new student();
			// set the student object to the model.
			theStudentModel.addAttribute("student" , aStudent);
			
			return "showStudentForm";
			
			
		}
		
		
		@RequestMapping("/studentValidate")
		public String procesform(@ModelAttribute("student") student student) {
		
			boolean validUser = false;
			if (student.firstname.equals("YuvaRaj")) {
				validUser=true;
			}
			
			System.out.println(student.getFirstname());
			System.out.println(validUser);
				if (validUser) {
					return "formProcess";
				}
				return "main-page";
		}
		
}
