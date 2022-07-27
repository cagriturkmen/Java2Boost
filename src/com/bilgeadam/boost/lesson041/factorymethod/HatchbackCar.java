package com.bilgeadam.boost.lesson041.factorymethod;

public class HatchbackCar extends Car {

	 HatchbackCar() {
		super(CarType.HATCHBACK);
		construct();
	 }

	@Override
	protected void insertTyres() {
		System.out.println("Inserted 17' tyres");		
	}

	@Override
	protected void placeGasTank() {
		
		System.out.println("40L tank placed.");
	}
	
	
	public static void main(String[] args) {
		Car car = new HatchbackCar();
	}
}
