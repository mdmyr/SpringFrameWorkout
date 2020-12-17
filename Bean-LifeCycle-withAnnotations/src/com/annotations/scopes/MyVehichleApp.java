package com.annotations.scopes;

import javax.management.loading.PrivateClassLoader;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyVehichleApp {

	public static void main(String[] args) {
		
		VehicleI suvBlack;
		VehicleI suvBlack2;
		System.out.println("The my Vehicle app started:\n");
		//loading the bean context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		//retrieve the bean 
		  suvBlack = context.getBean("suvCarImple", VehicleI.class);
		  System.out.println("\nBean cnfiguration provided:");
		//call the methods
		  suvBlack.start();
		  suvBlack.stop();
		  suvBlack.gas();
		//close the bean
		  
		// Creating another instance using without any scope .i.e. singleton 
		  suvBlack2 = context.getBean("suvCarImple", VehicleI.class);
		  
		//call the methods
		  //suvBlack2.start();
		  suvBlack2.stop();
		  suvBlack2.gas();
		 // point to be noted. 
		  context.close();
		  
	}

}
