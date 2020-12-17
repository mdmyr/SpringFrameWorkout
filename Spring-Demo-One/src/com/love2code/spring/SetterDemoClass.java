package com.love2code.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoClass {

	public static void main(String[] args) {

		// load the configuration file.
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve the bean
		CricketCoach theCoach = context.getBean("MyCricketCoach", CricketCoach.class);

		// call the methods on the bean

		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		// close the bean
		context.close();

	}

}
