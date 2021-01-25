package com.luv2code.springdemo.serviceLayer;

import java.util.List;

import javax.transaction.Transactional;

import com.luv2code.springdemo.entity.CustomerEntity;

public interface ICustomerServices {

	List<CustomerEntity> getCustomer();
	public void  saveCustomer(CustomerEntity customer);
	
}