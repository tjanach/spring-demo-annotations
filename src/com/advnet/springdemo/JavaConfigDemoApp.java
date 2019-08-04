package com.advnet.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
//		MyLoggerConfig mlc = context.getBean("myLoggerConfig", MyLoggerConfig.class);
//		mlc.initLogger();
		
		Coach c = context.getBean("tennisCoach", Coach.class);
		System.out.println(c.getDailyWorkout());
		System.out.println(c.getDailyFortune());
		
		context.close();
	}

}
