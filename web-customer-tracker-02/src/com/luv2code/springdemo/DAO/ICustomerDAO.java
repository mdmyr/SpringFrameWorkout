package com.luv2code.springdemo.DAO;

import java.util.List;

import com.luv2code.springdemo.entity.CustomerEntity;

public interface ICustomerDAO {

		List<CustomerEntity> getCustomer();
}