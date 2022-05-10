package com.bilgeadam.boost.lesson017.superlesson;

public class Dog2 extends Animal2 {


	void eat() {
		System.out.println("eating dog food...");
	}
	void bark() {
		System.out.println("hav hav hav");
	}
	
	void work() {
		super.eat();
		bark();
		
	}
	
}
