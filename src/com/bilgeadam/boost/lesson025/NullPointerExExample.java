package com.bilgeadam.boost.lesson025;

public class NullPointerExExample {

	public static void main(String[] args) {
		
		
		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			e.printStackTrace();
		} finally {
			System.out.println("I'll work whatever happens.");
		}
		
		
	}

}
