package com.bilgeadam.boost.lesson020;

public enum SizeEnumClass {

	SMALL,MEDIUM,LARGE,XLARGE;
	
	public String getSize() {
		
		switch (this) {
		case SMALL:
			return "small";
		case MEDIUM:
			return "MEDIUM";
			
		case LARGE:
			return "LARGE";
		case XLARGE:
			return "XLARGE";

		default:
			return "Size not found";
		}
	}
	
	public static void main(String[] args) {
		System.out.println("The size of the pizza is "+ SizeEnumClass.SMALL.getSize());
	}
}
