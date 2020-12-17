package com.SpringFormTag;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudenValidationController {
	
	//this the method invoked in the .jsp page on submit
	@RequestMapping("/validateStudent")
	public String  validateStudent(  @ModelAttribute("validateStudent") s,  Model model) {
		
		return "Student-Status";
	}
	
	
	
	//landing page
	@RequestMapping("/")
	public String welcomePage() {
		return "Welcome";
	}

}
