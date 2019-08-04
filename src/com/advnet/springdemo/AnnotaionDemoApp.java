package com.advnet.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotaionDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		MyLoggerConfig mlc = context.getBean("myLoggerConfig", MyLoggerConfig.class);
		mlc.initLogger();
		
		Coach c = context.getBean("tennisCoach", Coach.class);
		System.out.println(c.getDailyWorkout());
		System.out.println(c.getDailyFortune());
		
		Coach kc = context.getBean("karateCoach", Coach.class);
		System.out.println(kc.getDailyWorkout());
		System.out.println(kc.getDailyFortune());
		
		context.close();
	}

}
