package com.bilgeadam.boost.lesson026.example;

public class Janitor extends Employee{

	public Janitor(String name, String lastname, String job, double salary) {
		super(name, lastname, job, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String increaseSalary(double salary) {
		
		salary = salary * 1.1;
		
		return "New salary "+salary;
	}

}
