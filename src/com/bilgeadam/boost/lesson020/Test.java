package com.bilgeadam.boost.lesson020;

public class Test {

	public static void main(String[] args) {
//		
//		System.out.println(Size.SMALL);
//		System.out.println(Size.EXTRALARGE);
		
		Pizza pizza = new Pizza(Size.MEDIUM);
		System.out.println(pizza.getPizzaSize());;
		//pizza.orderPizza();
		Pizza pizza2 = new Pizza(SizeEnumClass.LARGE);
		pizza2.size.SMALL.getSize();
	}

}
