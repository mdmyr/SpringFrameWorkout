package com.annotations.scopes;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component
@Scope("singleton")
public class SuvCarImple implements VehicleI {
	@Value("${foo.email}")
	private String email;


	private int counter=0;
	@Override
	
	public void start() {
		System.out.println("SUV Started");
		counter = counter+1;
	}

	@Override
	public void stop() {
		System.out.println("SUV Stopped ");
	}

	@Override
	public void gas() {
		System.out.println("SUV pushed the gas");
		System.out.println("Couter value from SUV" + counter);
	}

	//init- method
	@PostConstruct
	public void postConstructionsMethod() {
		System.out.println("\nThis method will be created after the contructor and dependency injection");
		System.out.println("No- aug and cannot capture the return type");
		System.out.println("You dont have to make a call\n");
	}
	
	@PostConstruct
	public void postConstructionsMethod2() {
		System.out.println("\nThis method2 will be created after the contructor and dependency injection");
		System.out.println("No- aug 2  and cannot capture the return type");
		System.out.println("You dont 2  have to make a call\n");
	}
	
	
	//destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("\nThis is a pre-destroy method:");
		
	}
	
	@PreDestroy
	public void doMyCleanupStuff2() {
		System.out.println("\n This is a second cleanup method");
		System.out.println("Send email to  : " + email);
		
	}
}
