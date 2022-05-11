package com.bilgeadam.boost.lesson018.polymorphism;

public class Test {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Animal pig = new Pig();
		Animal dog = new Dog();
		
		animal.animalSOund();
		pig.animalSOund();
		dog.animalSOund();
		
	}

}
