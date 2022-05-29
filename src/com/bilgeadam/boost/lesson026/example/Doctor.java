package com.bilgeadam.boost.lesson026.example;

public class Doctor extends Employee {

	public Doctor(String name, String lastname, String job, double salary) {
		super(name, lastname, job, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String increaseSalary(double salary) {
		
		salary = salary * 1.3;
		
		return "New salary "+salary;
	}



}
