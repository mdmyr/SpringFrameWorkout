package com.lu2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lu2code.springdemo.dao.CustomerDAO;
import com.lu2code.springdemo.entity.Customer;

/*
 * This is the main controller for the DAO.
 */

@Controller
@RequestMapping("/customer")
public class CustomerController {

	//inject customer DAO. 
	
		@Autowired
	    private CustomerDAO customerDAO;
	
		@RequestMapping("/list")
		public String listCustomers(Model theModel) {
			
			//get the customer from dao 
			List<Customer>  theCustomers = customerDAO.getCustomers();
			theModel.addAttribute("customers", theCustomers);
			theModel.addAttribute("New Customer Screen");
			//add the customer to the dao model
			return "list-customers";
		}
}
