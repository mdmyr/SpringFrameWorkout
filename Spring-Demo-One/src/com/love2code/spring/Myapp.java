package com.love2code.spring;

//Main program
public class Myapp {

	public static void main(String[] args) {

		//Coach theCoach = new BaseBallCoach();
		
		Coach theCoach = new TrackCoach();
		
		System.out.println(theCoach.getDailyWorkout());
		
	}

	
}
