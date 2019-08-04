package com.advnet.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] data = {
			"Random Fortune one: beware of wolf.",
			"Random Fortune two: beware of insect.",
			"Random Fortune three: beware of dog."
	};
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		return data[myRandom.nextInt(data.length)];
	}

}
