package com.bilgeadam.boost.lesson018.example;

public abstract class Person {
	
	private String name;
	private int age;
	private boolean isHealty;
	
	
	//All argument Constructor
	public Person(String name, int age, boolean isHealty) {
		this.name = name;
		this.age = age;
		this.isHealty = isHealty;
	}

	boolean checkIfHealty() {
		if(this.isHealty==true) {
			checkUp();
			return true;
		}else {
			examinePatient();
			givePerscription();
			return false;
		}
	}
	
	abstract void checkUp();
	abstract void examinePatient();
	void givePerscription() {
		
		System.out.println("Yapılan muayene sonucuna reçete yazıldı.");
	}
	
	
	//getters setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isHealty() {
		return isHealty;
	}

	public void setHealty(boolean isHealty) {
		this.isHealty = isHealty;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", isHealty=" + isHealty + "]";
	}
	
	
}
