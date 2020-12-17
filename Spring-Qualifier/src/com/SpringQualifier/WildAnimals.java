package com.SpringQualifier;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WildAnimals implements Animal {

	@Override

	public void head() {
		System.out.println("Animals have heads");
	}

	@Override
	public void tail() {
		System.out.println("Animals may have tails");
	}

	@Override
	public void legs() {
		System.out.println("Animals may have legs");
	}
	
	
	
	// method that returns as random string
	
//	1. create a arrayslist of good thoughts
//	2. create a methods to return the random thought from thelist
//	
	public String[] randomThought= {"Thought1" , "Thought2","Thought3", "Thought4","Thought5" };
	
	
	public void getRandomThought(){
		Random randomNumber = new Random();
		int lengthOfString = randomThought.length;
		System.out.println(randomThought.length);
		System.out.println(randomNumber.nextInt(lengthOfString));
		System.out.println(randomThought[randomNumber.nextInt(lengthOfString)]);
	}
	


}
