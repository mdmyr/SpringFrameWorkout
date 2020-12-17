package com.springFormValidation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerControllerMain {
	
CustomerForm Customer;
	
	@RequestMapping("/")
		public String homePage() {
			return "Home";
		}
	
	@RequestMapping("/customerForm")
		public String customerForm(@ModelAttribute("Customer") CustomerForm customerForm) {
		
		System.out.println("Am here ");
		return "Customer";
	}
	
	@RequestMapping("/customerSubmit")
		public String customerSubmit(@ModelAttribute("Customer") CustomerForm customerForm) {
		return "thanksForSubmit";
	}
	
	

}
