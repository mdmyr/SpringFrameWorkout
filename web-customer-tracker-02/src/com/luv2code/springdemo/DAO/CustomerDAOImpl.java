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
	// move transactional to a new layer "Service".		
	public List<CustomerEntity> getCustomer(){
		
		Session currentSession = sessionB.getCurrentSession();
			 Query queryResult	= currentSession.createQuery(" from CustomerEntity order by last_name", CustomerEntity.class);
			 List<CustomerEntity> customers =  queryResult.getResultList();
		return customers;
		
	}
	
	public void  saveCustomer(CustomerEntity addCustomer) {
		
	Session currentSession=sessionB.getCurrentSession();
		    currentSession.save(addCustomer);
	}
	
	

}
