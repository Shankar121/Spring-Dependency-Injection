package com.learning.spring.di;

import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getMyDailyWorkout() {
		// TODO Auto-generated method stub
		return "do tennis practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
