package com.bilgeadam.boost.lesson009;

import java.util.Scanner;

public class PrintPattern {

	public static void main(String[] args) {
		int i,row;
		boolean answer = true;
		String str = "";
		
		do {
		Scanner scanner = new Scanner(System.in);
		
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
			System.out.println("Hatalı giriş! Devam etmek istiyor musunuz?(E)");
			Scanner scanner2 = new Scanner(System.in);
			str = scanner2.nextLine();
			if(!str.equalsIgnoreCase("E")) {
				System.out.println("Byee!!");
				answer=false;
			}
		  }
		}while(answer);
	}
//Hayır derse kullanıcı bay bay desin program
}
