package com.bilgeadam.boost.lesson020;

public class Pizza {
	
	SizeEnumClass size;
	Size pizzaSize;

	public Pizza(Size pizzaSize) {
		super();
		this.pizzaSize = pizzaSize;
	}
		
	
	public Pizza(SizeEnumClass size) {
		super();
		this.size = size;
	}



	public void orderPizza() {
		
		switch (pizzaSize) {
		case SMALL:
			System.out.println("I ordered a small size pizza");
			break;
		case MEDIUM:
			System.out.println("I ordered a MEDIUM size pizza");
			break;
		case LARGE:
			System.out.println("I ordered a LARGE size pizza");
			break;
		case EXTRALARGE:
			System.out.println("I ordered a EXTRALARGE size pizza");
			break;

		default:
			System.out.println("I dont know which one to order.");
			break;
		}
		
	}

	public Size getPizzaSize() {
		return pizzaSize;
	}

	public void setPizzaSize(Size pizzaSize) {
		this.pizzaSize = pizzaSize;
	}
	
	
}
