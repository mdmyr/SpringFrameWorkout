package com.springConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Yuvi
 * this can be used for the registration of the commercial drivers.
 *
 */
public class DriverRegistration {

	public static void main(String[] args) {
		DriverClass driverObj;
		//register using the xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		//retrieve 
		driverObj=context.getBean("DriverClassBean",DriverClass.class);
		// class the methods
		driverObj.getName();
		driverObj.getDOB();
		driverObj.getAddress();
		//constructor injection 
		
		//driverObj.drivingCategory();
		
		//close the bean
		context.close();

	}

}
