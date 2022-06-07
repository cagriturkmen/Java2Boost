package com.bilgeadam.boost.lesson035.factorymethod.example;

public abstract class Car {
	
	private CarType model;

	public Car(CarType model) {
		this.model = model;
	}
	
	protected abstract void insertTyres();
	protected abstract void placeGasTank();
	
	protected void construct() {
		insertTyres();
		placeGasTank();
	}

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}
	
	
	
}
