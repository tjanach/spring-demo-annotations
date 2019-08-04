package com.advnet.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fs;
	
	public TennisCoach() {
		System.out.println(">> inside TennisCoach default constructor");
	}
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> inside DoMyStartupStuff");
	}
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> inside DoMyCleanupStuff");
	}
		
	@Override
	public String getDailyWorkout(){
		return "Practice your backhand voley";
	}

	@Override
	public String getDailyFortune() {
		return fs.getFortune();
	}

}
