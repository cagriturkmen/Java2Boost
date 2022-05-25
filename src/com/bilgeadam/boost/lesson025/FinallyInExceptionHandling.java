package com.bilgeadam.boost.lesson025;

public class FinallyInExceptionHandling {

	public static void main(String[] args) {
		
		try {
			int data = 25/0;
			System.out.println(data);
		} catch (ArithmeticException e) {
			System.out.println("Hata yakalandı.");
		} finally {
			System.out.println("finally block is always executed.");
		}
		
		
	}

}
