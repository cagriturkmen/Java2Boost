package com.bilgeadam.boost.lesson025;

public class ExampleArithmetic {

	public static void main(String[] args) {
		
	
		try {
			
			int x = 5/0;
			
		} catch (ArithmeticException ae) {
		System.out.println("Arithmetic Exception : " + ae.getMessage());
		}
		
	}

}
