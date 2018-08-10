package com.learning.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
//	Coach myCoach=context.getBean("myCoach",Coach.class);
//	System.out.println(myCoach.getMyDailyWorkout());
//	System.out.println(myCoach.getDailyFortune());
//	
//	Coach alphaCoach=context.getBean("myCoach",Coach.class);
//	System.out.println(alphaCoach.getMyDailyWorkout());
//	System.out.println(alphaCoach.getDailyFortune());
	
//	Coach coach=context.getBean("coach",Coach.class);
//	System.out.println(coach.getMyDailyWorkout());
//	//System.out.println(coach.getDailyFortune());
//	Coach alphaCoach=context.getBean("coach",Coach.class);
//	System.out.println(alphaCoach.getMyDailyWorkout());
	Coach coach=context.getBean("coach",Coach.class);
	System.out.println(coach.getMyDailyWorkout());
	Coach alphaCoach=context.getBean("coach",Coach.class);
	System.out.println(alphaCoach.getMyDailyWorkout());
	context.close();
}
}
