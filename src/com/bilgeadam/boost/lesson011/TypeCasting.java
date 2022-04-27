package com.bilgeadam.boost.lesson011;

public class TypeCasting {

	public static void main(String[] args) {
		
		//widening
		int myInt = 9;
		double myDouble = myInt; //Automatic casting : int to double
		
//		System.out.println(myInt);
//		System.out.println(myDouble);
		
		//narrowing
		double myDouble2 = 9.78d;
		int myInt2 = (int) myDouble2; // Manual Casting : double to int
		
//		System.out.println(myDouble2);
//		System.out.println(myInt2);
		
		//////////////////////////////////////////////////////////////////////////
		//Type conversion from int to String
		int num = 10;
		//System.out.println("The integer value is : "+num);
		
		String data = String.valueOf(num); // converts int to string type //int değeri String değere dönüştürüyor.
		//System.out.println("The string value is: "+data);
		
		//Type conversion from String to int
		
		String data2 = "10";
		System.out.println("The string value is :"+ data2);
		
		int num2 = Integer.parseInt(data2); // converts string variable to int // String değeri int değere dönüştürüyor.
		System.out.println("The integer value is :" +num2);

		
		
		
	}

}
