package com.bilgeadam.boost.maraton.entity;

import java.time.LocalDate;

public abstract class Employee extends Person{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7553987496062117175L;
	
	private String id;
	protected double startingSalary;
	protected double salary;
	
	public Employee( Name name, Gender gender, int age, Occupation occupation, LocalDate birthday,
			LocalDate startingDate, LocalDate leavingDate, PhoneNumber phoneNumber, double startingSalary,
			 MarriageStatus marriageStatus) {
		super(name, gender, age, occupation, birthday, startingDate, leavingDate, phoneNumber, marriageStatus);
		this.id = setId();
		this.startingSalary = startingSalary;
		this.salary = getSalary();
	}
	
	public Employee(Name name, Gender gender, int age, Occupation occupation, LocalDate birthday,
			LocalDate startingDate, PhoneNumber phoneNumber, int startingSalary,
			MarriageStatus marriageStatus) {
		super(name, gender, age, occupation, birthday, startingDate, phoneNumber, marriageStatus);
		this.id = setId();
		this.startingSalary = startingSalary;
		this.salary = getSalary();
		}

	public abstract double calculateLatestSalary();
	
	public abstract String setId();

	public double getStartingSalary() {
		return startingSalary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

}
