package com.bilgeadam.boost.maraton.entity;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4247500913437253645L;
	private Name name;
	private Gender gender;
	private int age;
	private Occupation occupation;
	private LocalDate birthday;
	private LocalDate startingDate;
	public  LocalDate leavingDate;
	private PhoneNumber phoneNumber;
	public  MarriageStatus marriageStatus;
	
	
	public Person(Name name, Gender gender, int age, Occupation occupation, LocalDate birthday,
			LocalDate startingDate, LocalDate leavingDate, PhoneNumber phoneNumber, MarriageStatus marriageStatus) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.occupation = occupation;
		this.birthday = birthday;
		this.startingDate = startingDate;
		this.leavingDate = leavingDate;
		this.phoneNumber = phoneNumber;
		this.marriageStatus = marriageStatus;
	}


	public Name getName() {
		return name;
	}


	public Gender getGender() {
		return gender;
	}


	public int getAge() {
		return age;
	}


	public Occupation getOccupation() {
		return occupation;
	}


	public LocalDate getBirthday() {
		return birthday;
	}


	public LocalDate getStartingDate() {
		return startingDate;
	}


	public LocalDate getLeavingDate() {
		return leavingDate;
	}


	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + ", occupation=" + occupation
				+ ", birthday=" + birthday + ", startingDate=" + startingDate + ", leavingDate=" + leavingDate
				+ ", phoneNumber=" + phoneNumber +"marriage:"+ marriageStatus + "]";
	}
	
	
	
	
}
