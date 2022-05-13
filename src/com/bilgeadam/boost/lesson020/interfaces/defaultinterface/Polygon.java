package com.bilgeadam.boost.lesson020.interfaces.defaultinterface;

public interface Polygon {

	void getArea();
	
	//default method
	default int perimeter(int lineLength, int numberOfEdges) {
		
		System.out.println(lineLength*numberOfEdges);
		return lineLength*numberOfEdges;
	}
	
}
