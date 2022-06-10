package com.bilgeadam.boost.lesson037.liskov;

import java.util.List;

public abstract class BaseCar {

	public int tripKm(int distance) {
		return distance;
	}
	
	public abstract double getCostPerKm();
	
	
	
	
}
