package com.bilgeadam.boost.lesson020.interfaces.examples;

public class Test {

	public static void main(String[] args) {
		
		Triangle t = new Triangle();
		t.calculateArea(4);
		
		Triangle t2 = new Triangle();
		t2.lineLength=4;
		t2.calculateArea();
		
		Polygon square = new Square();
		square.calculateArea(5);
		
	}

}
