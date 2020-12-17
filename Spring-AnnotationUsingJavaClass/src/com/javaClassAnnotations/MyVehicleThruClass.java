package com.javaClassAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyVehicleThruClass {

	public static void main(String[] args) {
		
		IVehicle accuraCrossOver;
		
		// You need to create a java class for the configuration
		// need an annotations to scan the package
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		accuraCrossOver =  context.getBean("crossOverImple",IVehicle.class);
		
		accuraCrossOver.start();
		accuraCrossOver.stop();
		accuraCrossOver.gas();
		
		

	}

}
