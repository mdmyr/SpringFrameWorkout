package com.SpringQualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAnimalsApp {

	public static void main(String[] args) {
		
		Humans humans;
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		
		humans = context.getBean("humans",Humans.class);
		humans.getBeingDetails();
		humans.head();
		
	}

}
