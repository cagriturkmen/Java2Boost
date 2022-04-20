package com.bilgeadam.boost.lesson008;

import java.util.Scanner;

public class Tax_Profit {

	public static void main(String[] args) {
		double  endPrice, priceWithoutVAT, rawPrice, tax,profit;
		tax=18;
		profit=15;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter product end price: ");
		endPrice = scanner.nextDouble();
		
		priceWithoutVAT = (endPrice*100)/(100+tax);
		rawPrice = (priceWithoutVAT*100)/(100+profit);
		System.out.println(rawPrice);
	}

}
