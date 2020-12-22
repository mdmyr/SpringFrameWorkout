package com.hibernateSaveEntity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.cache.annotation.CachingConfigurationSelector;




public class MyHibernateApp {
	
	public static void main(String[] args) {
		
		//create a instance to connect to database using hibernate
		
		// create session 
		
		
		
		
		
		SessionFactory sessionFact = new Configuration().configure("Hibernate_self.cfg.xml").buildSessionFactory();
		Session session = sessionFact.getCurrentSession();
		
		
		session.beginTransaction();
	
		session.close();
		
	}

}
