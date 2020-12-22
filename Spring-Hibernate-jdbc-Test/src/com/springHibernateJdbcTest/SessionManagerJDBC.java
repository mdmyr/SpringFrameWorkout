package com.springHibernateJdbcTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.TypeHelper;
import org.hibernate.cfg.Configuration;


public class SessionManagerJDBC {
	
	// Session manager will take care of connectin the db.
	// you need have 2 things
//		1. cfg.xml
////		2. class for annotations.
//				1. you need define, entity,table and columns
//		
	
	
	public static void main(String[] args) {

		// take the .xml config
		// take the entity class
		// build the session factory instance.
			SessionFactory conf= new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(StudentEntity.class)
								.buildSessionFactory();
			
			
			//testing 
			Configuration conf2= new Configuration()
					.configure("hibernate.cfg.xml");
			System.out.println("PROPS");
			SessionFactory sessionNew=  conf2.addAnnotatedClass(StudentEntity.class).buildSessionFactory();					
			
			
			
			
			
			//eod testing
			
		//get instance
		Session session=conf.getCurrentSession();		
		System.out.println(" new student");		
		StudentEntity mahathi = new StudentEntity("Mahathi","Yamuzala","ymahathi@gmail.com");
		
		
		
		session.beginTransaction();
		session.save(mahathi);
		System.out.println(session.getIdentifier(mahathi));
		
		session.persist(mahathi);
		session.getTransaction().commit();
		
		System.out.println("Committed");
		
		session.close();
		
		
			
	}

}
