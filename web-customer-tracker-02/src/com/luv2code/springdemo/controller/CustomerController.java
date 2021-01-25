package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luv2code.springdemo.DAO.ICustomerDAO;
import com.luv2code.springdemo.entity.CustomerEntity;
import com.luv2code.springdemo.serviceLayer.CustomerService;
import com.luv2code.springdemo.serviceLayer.ICustomerServices;

/* controller for the customer object */

@Repository
@RequestMapping("/customers")
public class CustomerController {

		@Autowired
		//private ICustomerDAO customers;
		private ICustomerServices customers;
		@GetMapping("/list")
		public String getCustomers(Model model) {
			List<CustomerEntity> customer= customers.getCustomer();
				model.addAttribute("customer", customer);	
				System.out.println(customer);
				return "list-customers";
		}
		
		
		// you showing ui whats the model going to 
		// be like 
		@GetMapping("/showFormForAdd")
		public String showFormForAdd(Model theModel) {
			CustomerEntity addCustomer = new CustomerEntity();
			
			
			theModel.addAttribute("customerEntity",addCustomer);
			
			return "new-customer";
		}
		
		
		//when user clicks on save it triggers post method
		
		
		@PostMapping("/saveCustomer")
		public String saveCustomerCustomer(@ModelAttribute("CustomerEntity") CustomerEntity addCustomer )
		{
			customers.saveCustomer(addCustomer);
				return "redirect:/customers/list";
		}
		
		@PostMapping("/updateCustomer")
		public  String updateCustomer( ) {
			
			return "Update-customer";
		}
		
}
