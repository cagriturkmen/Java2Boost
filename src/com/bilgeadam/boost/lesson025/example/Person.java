package com.bilgeadam.boost.lesson025.example;

public class Person {
	
	String name;
	String gender;
	
	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}
	
	
}
