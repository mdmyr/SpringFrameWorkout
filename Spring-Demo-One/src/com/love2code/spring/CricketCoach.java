package com.love2code.spring;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	
	//constructor 
	public CricketCoach() {
		System.out.println("Inside the CricketCoach contructor");
	}
	
	//setter method generator
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside the setting method:");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice bowling";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFurtune();
	}

}
