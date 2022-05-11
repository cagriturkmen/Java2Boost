package com.bilgeadam.boost.lesson018.example;

public class Child extends Person{

	public Child(String name, int age, boolean isHealty) {
		super(name, age, isHealty);

	}
	void getVaccine() {
		System.out.println("Kizamik asisi yapildi.");
	}
	
	
	@Override
	void checkUp() {
		System.out.println("Cocuga bir seker verildi.");
		System.out.println("Kontroller yapildi.");
	}

	@Override
	void examinePatient() {
		System.out.println("Oyun esliginde muayene yapildi.");
		
	}

}
