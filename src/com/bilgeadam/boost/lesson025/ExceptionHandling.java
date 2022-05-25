package com.bilgeadam.boost.lesson025;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		
		
		try {
			//Hataya sebep olabilecek herhangi bir kod..
			//int myInt = Integer.parseInt("erşan");
			return;
		} catch (NumberFormatException | NullPointerException e) {
			//Hata durumu oluştuğunda çalışmasını istediğimiz kod.
			System.out.println("Stop trying convert a textt to a number!!");
		} finally {
			System.out.println("Finally block");
		}
		
	}
	
	

}
