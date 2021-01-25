package com.luv2code.springdemo.serviceLayer;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.luv2code.springdemo.DAO.CustomerDAOImpl;
import com.luv2code.springdemo.DAO.ICustomerDAO;
import com.luv2code.springdemo.entity.CustomerEntity;

////
// This is the primary service for the 
// customer controller
@Service
public class CustomerService implements ICustomerServices {

	@Autowired
	ICustomerDAO customerDAO;
	
	
	@Override
	@Transactional
	public List<CustomerEntity> getCustomer() {
		// TODO Auto-generated method stub
		//customerDAO.getCustomer();
		return customerDAO.getCustomer();
	}


	@Override
	@Transactional
	public void saveCustomer(CustomerEntity customer) {
		
		System.out.println(customer);
		customerDAO.saveCustomer(customer);
		
	}
	
	
}
