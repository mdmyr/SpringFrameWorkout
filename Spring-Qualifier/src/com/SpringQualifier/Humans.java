package com.SpringQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Humans implements Animal {
@Autowired
@Qualifier("wildAnimals")
	 Animal beings;


@Autowired
WildAnimals wildAnimal;


//injecting field literals.
// using the context property -place holder.

@Value("${foo.user}")
private String name;
@Value("${foo.email}")
private String email;
@Value("${foo.location}")
private String location;
	 
	@Override
	public void head() {
		System.out.println("Human Head\n");
		System.out.println("Method injection \nPrinting the autowire a new methond in the child which prints a random number.");
		wildAnimal.getRandomThought();
		
		System.out.println("Literal injection from properties file.\nLets print the literal values :\n");
		System.out.println("name :" +  name);
		System.out.println("email :" + email);
		System.out.println("email :" + location);
		
	}

	@Override
	public void tail() {
		System.out.println("Humans have no tails");

	}

	@Override
	public void legs() {
		System.out.println("Humans have two legs");

	}
	
	public void getBeingDetails() {
		beings.head();
		beings.legs();
		beings.tail();
		
	}
	
	

}
