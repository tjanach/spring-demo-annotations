package com.advnet.springdemo;

import org.springframework.stereotype.Component;

@Component
public class KarateCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Do KATA";
	}

}
