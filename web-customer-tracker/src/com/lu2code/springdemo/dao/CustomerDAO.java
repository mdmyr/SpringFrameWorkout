package com.lu2code.springdemo.dao;
/*
 * List of the customer 
 */
import java.util.List;

import com.lu2code.springdemo.entity.Customer;

public interface CustomerDAO {

		List<Customer> getCustomers();
}
