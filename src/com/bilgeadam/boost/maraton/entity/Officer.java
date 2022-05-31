package com.bilgeadam.boost.maraton.entity;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Officer extends Employee {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2362868249813416210L;
	
	static int officerCounter = 0;
	
	
	public Officer(Name name, Gender gender, int age, Occupation occupation, LocalDate birthday,
			LocalDate startingDate, LocalDate leavingDate, PhoneNumber phoneNumber, double startingSalary,
			double salary, MarriageStatus marriageStatus) {
		super(name, gender, age, occupation, birthday, startingDate, leavingDate, phoneNumber, startingSalary, salary, marriageStatus);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateLatestSalary() {
int wageIncreaseNumber = 0;
		
		if(leavingDate == null) {
			wageIncreaseNumber = (int) (this.getStartingDate().until(LocalDate.now(),ChronoUnit.MONTHS)/6);
		}else {
			wageIncreaseNumber = (int) (this.getStartingDate().until(leavingDate,ChronoUnit.MONTHS)/6);
		}
		
		for (int i = 0; i < wageIncreaseNumber; i++) {
			salary += salary * 0.09;
		}
		setSalary(salary);
		return salary;
	}

	@Override
	public String setId() {
		String num = String.format("%03d", ++officerCounter);
		return "Officer - " + num;				
	}

}
