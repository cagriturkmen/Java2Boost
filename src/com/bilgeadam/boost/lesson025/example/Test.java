package com.bilgeadam.boost.lesson025.example;

public class Test {

	public static void main(String[] args) {
		
		Person p = new Person ("Çağrı","Female");
		
		try {
			
			if(!p.gender.equalsIgnoreCase("Female")) {
				throw new MyException();
			}else {
				System.out.println("Welcome Man-Free Area");
			}
			
		} catch (MyException e) {
			System.out.println("Caught the exception");
		}
		
	}

}
