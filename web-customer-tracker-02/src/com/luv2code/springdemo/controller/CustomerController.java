package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springdemo.DAO.ICustomerDAO;
import com.luv2code.springdemo.entity.CustomerEntity;

/* controller for the customer object */

@Repository
@RequestMapping("/")
public class CustomerController {

		@Autowired
		private ICustomerDAO customers;
		
		@RequestMapping("customers")
		public String getCustomers(Model model) {
				
			List<CustomerEntity> customer= customers.getCustomer();
				model.addAttribute("customer", customer);
				
				
				System.out.println(customer);
				return "list-customers";
		}
}
