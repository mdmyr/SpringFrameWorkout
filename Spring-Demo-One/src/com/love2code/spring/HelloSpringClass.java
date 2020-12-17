package com.love2code.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *  Step 2 Spring container.
 *  Step 3 retrieve the container.
 */
public class HelloSpringClass {
	public static void main(String[] args) {

		// load the spring configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve the spring bean // class the methods on beans

		Coach theCoach = context.getBean("Mycoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());//dependecy injection
			
		// close context.
		context.close();

	}

}
