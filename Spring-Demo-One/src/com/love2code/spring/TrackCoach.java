package com.love2code.spring;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run Hard 5K track";
	}

	@Override // added for the dependecy injection
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
