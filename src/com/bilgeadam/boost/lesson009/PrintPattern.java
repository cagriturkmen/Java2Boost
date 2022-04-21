package com.bilgeadam.boost.lesson009;

import java.util.Scanner;

public class PrintPattern {

	public static void main(String[] args) {
		int i,row;
		String str = "";
		Scanner scanner = new Scanner(System.in);
		do {
		System.out.println("Bir sayı giriniz: ");
		if(scanner.hasNextInt()) {
			row = scanner.nextInt();
		for ( i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		}else {
			System.out.println("Hatalı giriş!");
			System.out.println("Devam etmek istiyor musunuz?(E)");
			scanner.nextLine();
			str= scanner.nextLine();
		}
		}while(str.equalsIgnoreCase("E/H"));
	}
//Hayır derse kullanıcı bay bay desin program
}
