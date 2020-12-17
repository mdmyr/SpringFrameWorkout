package com.love2code.spring;

public class BaseBallCoach implements Coach {
	
	//created for dependency construction injection
	private FortuneService theFortuneService ;
	
	//created constructor for the constructor dependency injection
	public BaseBallCoach(FortuneService thefortuneService) {
		this.theFortuneService=thefortuneService;
	}
		
	public String getDailyWorkout() {
		return "30 BaseBall Workout";
	}

	
	@Override
	public String getDailyFortune() {		
		return theFortuneService.getFurtune();
	}

}
