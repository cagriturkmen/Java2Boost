package com.bilgeadam.boost.maraton.entity;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import com.bilgeadam.boost.maraton.exception.StudentException;
import com.bilgeadam.boost.maraton.exception.TeacherException;

public class Teacher extends Employee {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3324616224705370572L;
	static int teacherCounter = 0;
	
	
	
	public Teacher(Name name, Gender gender, int age, Occupation occupation, LocalDate birthday,
			LocalDate startingDate, LocalDate leavingDate, PhoneNumber phoneNumber, double startingSalary,
			double salary, MarriageStatus marriageStatus) throws TeacherException {
		super(name, gender, age, occupation, birthday, startingDate, leavingDate, phoneNumber, startingSalary, salary, marriageStatus);
		if(!this.getOccupation().equals(Occupation.TEACHER)) {
			throw new TeacherException();
		}	}

	public Teacher(Name name, Gender gender, int age, Occupation occupation, LocalDate birthday,
			LocalDate startingDate, PhoneNumber phoneNumber, int startingSalary, int salary, MarriageStatus marriageStatus) throws  TeacherException {
		super(name, gender, age, occupation, birthday, startingDate, phoneNumber, startingSalary, salary, marriageStatus);
		if(!this.getOccupation().equals(Occupation.TEACHER)) {
			throw new TeacherException();
		}
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
			salary += salary * 0.1;
		}
		setSalary(salary);
		return salary;
	}

	@Override
	public String setId() {
		String num = String.format("%03d", ++teacherCounter);
		return "Teacher - " + num;		
	}
	
	
}
