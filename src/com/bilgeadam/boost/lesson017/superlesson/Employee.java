package com.bilgeadam.boost.lesson017.superlesson;

public class Employee extends Person{

	float salary;

	public Employee(int id, String name, float salary) {
		super(id, name);
		this.salary = salary;
	}
	
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
	
}
