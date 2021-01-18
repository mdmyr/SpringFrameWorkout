package com.luv2code.springdemo.DAO;

import java.util.List;


import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.CustomerEntity;

@Repository
public class CustomerDAOImpl implements ICustomerDAO {
	
	//Actual implemenatation of hibernate to get the data.
	
	@Autowired
	SessionFactory sessionB;
	
	@Transactional
	public List<CustomerEntity> getCustomer(){
		
		Session currentSession = sessionB.getCurrentSession();
		Query queryResult	= currentSession.createQuery(" from CustomerEntity", CustomerEntity.class);
			 List<CustomerEntity> customers =  queryResult.getResultList();
		return customers;
		
	}

	

}
