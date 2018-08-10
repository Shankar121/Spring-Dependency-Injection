package com.learning.spring.di;

public class CricketCoach implements Coach{
	FortuneService fortuneService;
	String emailAddress;
	String team;
	
	public CricketCoach() {
		System.out.println("Constructor is invoked with hascode: "+hashCode());
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("setter is invoked for the CricketCoach");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getMyDailyWorkout() {
		return "Work with team- "+team+" Email- "+emailAddress;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void doInit() {
		System.out.println("inside CricketCoach doInit method");
	}
	
	public void doDestroy() {
		System.out.println("inside CricketCoach doDestroy method");
	}

}
