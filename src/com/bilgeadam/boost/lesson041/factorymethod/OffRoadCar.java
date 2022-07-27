package com.bilgeadam.boost.lesson041.factorymethod;

public class OffRoadCar extends Car {

	 OffRoadCar() {
		super(CarType.OFFROAD);
		construct();
	 }

	@Override
	protected void insertTyres() {
		System.out.println("Inserted 30' tyres");		
	}

	@Override
	protected void placeGasTank() {
		
		System.out.println("60L tank placed.");
	}
	
	
	public static void main(String[] args) {
		Car car = new OffRoadCar();
	}
}
