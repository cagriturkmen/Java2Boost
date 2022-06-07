package com.bilgeadam.boost.lesson035.factorymethod.example;

public class SedanCar extends Car{

	public SedanCar() {
		super(CarType.SEDAN);
		construct();
	}

	@Override
	protected void insertTyres() {
		
		System.out.println("Inserted 20' tyres");
		
	}

	@Override
	protected void placeGasTank() {
		System.out.println("50L tank inserted");		
	}

}
