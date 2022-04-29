package com.bilgeadam.boost.lesson015;

public class Person {

	private String name;
	private String lastname;
	private String gender;
	private int age;
	
	
	public Person() {
		
	}

	public Person(String name, String lastname, int age) {	
		this.name = name;
		this.lastname = lastname;
		this.age = age;
	}
	


	public Person(String name, String lastname, String gender, int age) {
		this.name = name;
		this.lastname = lastname;
		this.gender = gender;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", lastname=" + lastname + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	
}
