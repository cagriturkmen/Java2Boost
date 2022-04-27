package com.bilgeadam.boost.lesson011;

public class PrimitiveTypeToWrapper {

	public static void main(String[] args) {
		
		int a =5;
		double b = 5.65;
		
		Integer aObj = Integer.valueOf(a); // converts into wrapper class
		Double bObj = Double.valueOf(b);	// converts into wrapper class
		
		if(aObj instanceof Integer) {
			System.out.println("Integer nesnesi yaratıldı." + aObj);
		}
		if(bObj instanceof Double) {
			System.out.println("Double nesnesi yaratıldı." + bObj);
		}
		
		//Autoboxing
		int a1 = 5;
		//converts into wrapper class
		Integer a1Obj = a1;
		
		double b1 = 6.5;
		//converts into wrapper class
		Double b1Obj = b1;
		
	}

}
