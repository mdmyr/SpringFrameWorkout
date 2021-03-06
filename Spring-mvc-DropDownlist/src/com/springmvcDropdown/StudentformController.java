package com.springmvcDropdown;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
@RequestMapping("/forms")
public class StudentformController {
	
	//reading country values from prope
	//	@Value("#{countryOptions}") 
	   // private Map<String, String> country;
	 
	 
	// Home page 
	
	@Value("#{countryOptions}") 
    public Map<String, String> countryOptions;
	
	@Value("#{programmingLang}")
	public Map<String, String> programmingLang;
	@RequestMapping("/StudentForm")	
	public String StudentForm(Model studentform) {
		
		System.out.println(countryOptions.get("IN"));	   
		System.out.println("UserClicked the Studentform");
		Student studentForm = new Student();		
		studentform.addAttribute("Student", studentForm);
		studentform.addAttribute("countrylkp", countryOptions);
		//programming languages
		
		System.out.println("Languages" + programmingLang.get("MDM"));
				studentform.addAttribute("programminglkp", programmingLang);
		
		
		return "StudentValidationForm";
	}
	
	//modelAttribute
	
	@RequestMapping("/ProcessStudentform")
	public String ProcessStudentform(@ModelAttribute("Student") Student formInstance ) {
		System.out.println("User Submitted the form" + formInstance.toString());
		System.out.println(
		formInstance.getFirstName() + 
		formInstance.getLastName() + 
		formInstance.getCountry());
		
		System.out.println("Form submitted.");
		return "StudentFormValidation";
	}
}
