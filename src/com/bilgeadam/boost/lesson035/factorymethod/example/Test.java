package com.bilgeadam.boost.lesson035.factorymethod.example;

public class Test {

	public static void main(String[] args) {
		
		System.out.println(CarFactory.buildCar(CarType.HATCHBACK));
		System.out.println(CarFactory.buildCar(CarType.SEDAN));
		System.out.println(CarFactory.buildCar(CarType.JEEP));

		
		
	}

}
