package com.bilgeadam.boost.lesson020.interfaces.defaultinterface;

public class Test {

	public static void main(String[] args) {
		
		Polygon circle = new Circle();
		Rectangle r = new Rectangle();
		circle.perimeter(1, 1);
		r.perimeter(1, 4);
	}

}
