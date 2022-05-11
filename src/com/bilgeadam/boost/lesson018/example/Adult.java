package com.bilgeadam.boost.lesson018.example;

public class Adult extends Person{

	public Adult(String name, int age, boolean isHealty) {
		super(name, age, isHealty);

	}

	@Override
	void checkUp() {
		
		System.out.println("Sağlık kontrolü yapildi.");
		
	}

	@Override
	void examinePatient() {
		
		System.out.println("Hasta muayenesi yapildi.");
		
	}

}
