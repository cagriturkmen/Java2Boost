package com.bilgeadam.boost.lesson020.interfaces.defaultinterface;

public class Circle implements Polygon {

	@Override
	public void getArea() {
		
	}

	@Override
	public int perimeter(int lineLength, int numberOfEdges) {
		System.out.println("Daire çevresi hesaplandı 2pr");
		return Polygon.super.perimeter(lineLength, numberOfEdges);
	}
	

}
