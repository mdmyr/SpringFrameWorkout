package com.springmvcFormDisplay;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {
	//home page 
	
	@RequestMapping("/")
	public String  home() {
		return "homePage";
	}
	
		@RequestMapping("/showForm")
		public String displayForm() {
			return "displayForm";
		}
		
		@RequestMapping("/responseForm")
		public String reponseForm() {
			return "reponseForm";
		}
		
	// lets control the model before and afte the controller. using the HTTPServerletRequest HTTPSServlet Response
		
		@RequestMapping("/cleanseModel")
		public String 	convertModel(HttpServletRequest req, Model model) {
			
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
			fname=fname.toUpperCase();
			lname=lname.toUpperCase();
			model.addAttribute("message", fname);
			model.addAttribute("Lastname", lname);
			return "reponseForm";
			
		}
		
		// read data from html and bind to a variable.
		
		@RequestMapping("/bindData")
			public String bindHTMLdata(
						@RequestParam("fname") String FirstName , Model model )
			{
			
			String fname = FirstName;
			model.addAttribute("FName", fname);
			return "bindHTML";
		}
		
}
