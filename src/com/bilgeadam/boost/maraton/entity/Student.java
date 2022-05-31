package com.bilgeadam.boost.maraton.entity;

import java.time.LocalDate;

public class Student extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8645443614815950684L;
	
	private String id;
	static int studentCounter = 0;
	
	
	
	public Student(Name name, Gender gender, int age, Occupation occupation, LocalDate birthday, LocalDate startingDate,
			LocalDate leavingDate, PhoneNumber phoneNumber, MarriageStatus marriageStatus ) {
		super(name, gender, age, occupation, birthday, startingDate, leavingDate, phoneNumber, marriageStatus);
		this.id = setRegId();
	}



	String setRegId() {
		String year = String.valueOf(this.getStartingDate().getYear());
		String tempId = String.format("%03d", ++studentCounter);
		if(Student.studentCounter == 1000) {
			Student.studentCounter = 1;
		}
		return year +"-"+ tempId;
	}




	
}
