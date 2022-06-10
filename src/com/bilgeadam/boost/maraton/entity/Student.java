package com.bilgeadam.boost.maraton.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.bilgeadam.boost.maraton.exception.MarriageStatusException;
import com.bilgeadam.boost.maraton.exception.StudentException;

public class Student extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8645443614815950684L;
	private static List<Student> arrayList;
	private String id;
	private List<Course> lessons;

	static int studentCounter = 0;
	
	
	
	public Student(Name name, Gender gender, int age, Occupation occupation, LocalDate birthday, LocalDate startingDate,
			LocalDate leavingDate, PhoneNumber phoneNumber, MarriageStatus marriageStatus ) throws MarriageStatusException, StudentException {
		super(name, gender, age, occupation, birthday, startingDate, leavingDate, phoneNumber, marriageStatus);
		this.id = setRegId();
		this.lessons = new ArrayList<>();
		if(this.marriageStatus.equals(MarriageStatus.MARRIED)) {
			throw new MarriageStatusException();
		}
		if(!this.getOccupation().equals(Occupation.STUDENT)) {
			throw new StudentException();
		}
		arrayList.add(this);
	}



	String setRegId() {
		String year = String.valueOf(this.getStartingDate().getYear());
		String tempId = String.format("%03d", ++studentCounter);
		if(Student.studentCounter == 1000) {
			Student.studentCounter = 1;
		}
		return year +"-"+ tempId;
	}

	public List<Course> getLessons(){
		return this.lessons;
	}
	
	public void addLesson(Course lesson) {
		this.lessons.add(lesson);
	}

	public String getId() {
		return id;
	}

	


	
}
