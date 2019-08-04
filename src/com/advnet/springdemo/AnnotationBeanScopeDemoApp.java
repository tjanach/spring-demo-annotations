package com.advnet.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach tc = context.getBean("tennisCoach", Coach.class);
		Coach alphatc = context.getBean("tennisCoach", Coach.class);
		
		boolean result = tc == alphatc;
		System.out.println(tc);
		System.out.println(alphatc);
		
		System.out.println(result);
		
		context.close();

	}

}
