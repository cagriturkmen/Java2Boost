package com.bilgeadam.boost.lesson008;

import java.util.Scanner;

public class Positive_Negative {

	public static void main(String[] args) {
			int a;
		Scanner scanner = new Scanner(System.in);
		System.out.println("bir sayı gir: ");
		a= scanner.nextInt();
		if(a<0) {
			System.out.println("Negatif sayı");
		}else if(a==0) {
			System.out.println("Sayı sıfır");
		}else {
			System.out.println("Pozitif sayı");
		}
		
	}

}
