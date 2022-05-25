package com.bilgeadam.boost.lesson025;

public class ThrowExample {
	
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Person is not eligible to enter club.");
		}else {
			System.out.println("Welcome to club");
		}
	}

	public static void main(String[] args) {
		
		validate(19);
		
	}

}
