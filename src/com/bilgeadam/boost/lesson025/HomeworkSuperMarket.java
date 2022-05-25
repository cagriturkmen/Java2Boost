package com.bilgeadam.boost.lesson025;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeworkSuperMarket {

	public static void main(String[] args) {
		
		String product [] = {"Chips", "Coke", "Sugar","Olive", "Milk","Bread","Tea","Egg","Yoghurt","Cheese"};
		
		ArrayList<String> myCard = new ArrayList<>();
		
		while(true) {
			displayMenu();
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please choose. What you wanna do?");
			int input = scanner.nextInt();
			
			switch (input) {
			case 1:
				printProduct(product);
				break;
			case 2:
				addProduct(product, myCard);
				break;
			case 3:
				printMyCard(myCard);
				break;
			case 4:
				System.exit(0);
				break;

			default:
				break;
			}
			
		}
		
	}
	
	private static void displayMenu() {
		
		System.out.println("----------------------------");
		System.out.println("1- Show Products");
		System.out.println("2- Add product to Cart");
		System.out.println("3- Show cart");
		System.out.println("4- Exit");
		System.out.println("----------------------------");

		
	}
	
	public static void printProduct(String product []) {
		
		for (int i = 0; i < product.length; i++) {
			System.out.println(i+1 + "- "+product[i]);
		} 
	}
	
	public static void addProduct(String product [], ArrayList<String> myCard ) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter product number");
		int input = scanner.nextInt();
		myCard.add(product[input-1]);
		System.out.println(product[input-1] + " product added to your cart");
		
	}
	
	public static void printMyCard(ArrayList<String> myCard) {
		
		System.out.println("Products in Cart");
		System.out.println("--------------------");
		
		for (String productInCard : myCard) {
			System.out.println(productInCard);
		}
		
	}

}
