package com.bilgeadam.boost.lesson008;

import java.util.Scanner;

public class Fahreneit_Celcius {

	public static void main(String[] args) {
			
		double f;
		double c;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir fahreneit değeri giriniz: ");
		f= scanner.nextDouble();
		c=(f-32)/1.8;
		System.out.println(c);
		
	}

}
