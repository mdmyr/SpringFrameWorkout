package com.customerFormValidations;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")// landing page.
public class CustomerFormValiationController {
	
	public String homepage() {		
		System.out.println("Root");
		return "HomePage";// Create home page of this name
	}
}
