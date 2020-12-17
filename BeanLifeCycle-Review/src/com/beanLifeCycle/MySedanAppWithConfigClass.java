package com.beanLifeCycle;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MySedanAppWithConfigClass {
	
	public static void main(String[] args) {
		
		SedanMaster sadanCar;
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SedanConfigClass.class);
		
		sadanCar = context.getBean("sedanMaster",SedanMaster.class);
		sadanCar.start();
		sadanCar.status();
	}
}
