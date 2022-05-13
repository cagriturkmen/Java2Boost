package com.bilgeadam.boost.lesson020.interfaces.bank;

public class Test {

	public static void main(String[] args) {
		
		Bank b = new Garanti();
		Bank z = new Ziraat();
		System.out.println("ROI:" + z.rateOfInterest());
		
	}

}
