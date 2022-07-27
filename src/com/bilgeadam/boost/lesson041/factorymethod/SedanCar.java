package com.bilgeadam.boost.lesson041.factorymethod;

public class SedanCar extends Car {

	 SedanCar() {
		super(CarType.SEDAN);
		construct();
	 }

	@Override
	protected void insertTyres() {
		System.out.println("Inserted 18' tyres");		
	}

	@Override
	protected void placeGasTank() {
		
		System.out.println("40L tank placed.");
	}
	
	
	public static void main(String[] args) {
		Car car = new SedanCar();
	}
}
