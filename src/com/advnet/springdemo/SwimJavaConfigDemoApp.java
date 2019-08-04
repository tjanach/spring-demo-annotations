package com.advnet.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
//		MyLoggerConfig mlc = context.getBean("myLoggerConfig", MyLoggerConfig.class);
//		mlc.initLogger();
		
		Coach c = context.getBean("swimCoach", Coach.class);
		System.out.println(c.getDailyWorkout());
		System.out.println(c.getDailyFortune());
		
		SwimCoach sc = context.getBean("swimCoach", SwimCoach.class);
		System.out.println("email: "+sc.getEmail());
		System.out.println("team: "+sc.getTeam());
		
		context.close();
	}

}
