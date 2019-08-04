package com.advnet.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class KarateCoach implements Coach {
	
	@Autowired
	@Qualifier("fileRandomFortuneService")
	private FortuneService fs;
	
//	@Autowired directly on Filed, no setter need 
//	public void setFortuneService(FortuneService fs) {
//		this.fs = fs;
//	}

	@Override
	public String getDailyWorkout() {
		return "Do KATA";
	}

	@Override
	public String getDailyFortune() {
		return fs.getFortune();
	}

}
