package com.bilgeadam.boost.lesson018.example;

public class Test {

	public static void main(String[] args) {
		
		Child c = new Child("CagriJr",8,false);
		Adult a = new Adult("Cagri",24,true);
		System.out.println(c);
		System.out.println(c.getName());
		c.checkIfHealty();
		c.getVaccine();
		//a.checkIfHealty();
		
		
	}

}
