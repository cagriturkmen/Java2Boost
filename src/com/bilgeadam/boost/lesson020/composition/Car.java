package com.bilgeadam.boost.lesson020.composition;


public class Car {

	private final String name;
	private final  Engine engine; // Composition

	public Car(String name, Engine engine) {
		this.name = name;
		this.engine = engine;
	}

	public String getName() {
		return name;
	}

	public Engine getEngine() {
		return engine;
	}
	
	
	
}
