package com.bilgeadam.boost.lesson020.composition;

public class Test {

	public static void main(String[] args) {
		
		//Creating an object of Engine Class
		Engine engine = new Engine("Diesel",300,8);
		
		Car car = new Car("Mustang",engine);
		System.out.println("Name of car: "+car.getName()+"\n"+"Type of engine: "+engine.getType()+"");
		
		
	}

}
