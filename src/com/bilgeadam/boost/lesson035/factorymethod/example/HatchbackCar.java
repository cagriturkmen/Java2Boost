package com.bilgeadam.boost.lesson035.factorymethod.example;

public class HatchbackCar extends Car {

	public HatchbackCar() {
		super(CarType.HATCHBACK);
		construct();
	}

	@Override
	protected void insertTyres() {
		
		System.out.println("Inserted 17' tyres");
		
	}

	@Override
	protected void placeGasTank() {
		
		System.out.println("40L tank inserted");
		
	}

}
