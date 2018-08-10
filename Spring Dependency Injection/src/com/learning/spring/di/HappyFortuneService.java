package com.learning.spring.di;

public class HappyFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "Your day is lucky today";
	}

}
