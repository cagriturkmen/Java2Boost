package com.bilgeadam.boost.lesson035.factorymethod.example;

public class CarFactory {
	
	public static Car buildCar(CarType model) {
		
		Car car = null;
		
		switch (model) {
		case HATCHBACK:
			car = new HatchbackCar();
			break;
		case SEDAN:
			car = new SedanCar();
			break;
		case JEEP:
			car = new JeepCar();
			break;
			
		default:
			break;
		}
		return car;
	}
	
}
