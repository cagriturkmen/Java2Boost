package com.bilgeadam.boost.lesson020.interfaces.examples;

public class Square implements Polygon{

	@Override
	public double calculateArea(int lineLength) {
		System.out.println( Math.pow(lineLength, 2));
		return Math.pow(lineLength, 2);
	}

}
