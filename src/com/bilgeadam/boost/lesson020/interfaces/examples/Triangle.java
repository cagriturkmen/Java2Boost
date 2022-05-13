package com.bilgeadam.boost.lesson020.interfaces.examples;

public class Triangle implements Polygon{
	
	double lineLength;

	double square;
	
	@Override
	public double calculateArea(int lineLength) {
		square = Math.pow(lineLength, 2)*Math.sqrt(3)/4;
		System.out.println("Ucgen alani parametreli:"+square);
		return square;
		
	}
	
	public double calculateArea() {
		
		square = Math.pow(lineLength, 2)*Math.sqrt(3)/4;
		System.out.println("Ucgen alani parametresiz:"+square);
		return square;

	}

}
