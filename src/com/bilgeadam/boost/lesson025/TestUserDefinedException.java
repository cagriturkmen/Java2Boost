package com.bilgeadam.boost.lesson025;

public class TestUserDefinedException {

	public static void main(String[] args) {
		
		try {
			
			throw new UserDefinedException("This is user-defined exception");
		} catch (UserDefinedException ude) {
			System.out.println("Caught the excepiton");
			System.out.println(ude.getMessage());
		}
		
	}

}
