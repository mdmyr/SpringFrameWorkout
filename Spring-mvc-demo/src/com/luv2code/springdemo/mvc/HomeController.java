package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//configuration controller class

@Controller
public class HomeController {

		//Step 3
	    @RequestMapping("/")
		//Step 2: controller method
		public String showPage(){
			return "main-menu";//Step 4:Tells you which page need to be added.//check the servlet for the path
		}
	    
	    
	  
} 
