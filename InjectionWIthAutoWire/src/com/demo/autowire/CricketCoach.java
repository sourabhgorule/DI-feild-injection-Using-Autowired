package com.demo.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	@Autowired
	private Fortune fortune;
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "run hard";
	}

	@Override
	public String getHappyFortune() {
		// TODO Auto-generated method stub
		return fortune.getDailyForune();
	}

}
