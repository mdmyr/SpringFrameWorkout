package com.lu2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lu2code.springdemo.entity.Customer;



@Repository	
public class CustomerDAOImpl implements CustomerDAO {

	
	// inject hibernate session facotry '
	@Autowired
	private SessionFactory session;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		
		//get the hibernate session 
		Session currentSession = session.getCurrentSession();
		
		//create query 
		Query<Customer> theQuery= 
				currentSession.createQuery(" from customer",Customer.class );
		
		//get the result 
		
		List<Customer> customers = theQuery.getResultList();
		// return the list of the customer .
		
		
		
		return customers;
	}

}
