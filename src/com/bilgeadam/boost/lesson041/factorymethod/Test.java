package com.bilgeadam.boost.lesson041.factorymethod;

public class Test {

	public static void main(String[] args) {
		
		Car car = CarFactory.buildCar(CarType.OFFROAD);
		
		CarFactory.buildCar(CarType.SEDAN);		
		
		System.out.println(car);
		
	}

}
