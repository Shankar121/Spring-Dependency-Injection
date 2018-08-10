package com.learning.spring.di;

public class BaseBallCoach  implements Coach{

	FortuneService fortuneService;
	
	public BaseBallCoach(FortuneService fortuneService) {
		System.out.println("constructor called BaseBallCoach");
		this.fortuneService=fortuneService;
	}
	
	
	@Override
	public String getMyDailyWorkout() {
		return "DO Base BAll Practice "+hashCode();
	}


	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
