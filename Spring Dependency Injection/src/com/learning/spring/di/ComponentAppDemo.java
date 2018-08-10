package com.learning.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentAppDemo {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	TennisCoach coach=context.getBean("tennisCoach",TennisCoach.class);
	System.out.println(coach.getDailyFortune());
	context.close();
}
}
