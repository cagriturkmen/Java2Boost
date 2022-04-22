package com.bilgeadam.boost.lesson010;

import java.util.Scanner;
//Fibonacci serisi: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
public class Fibonacci {

	public static void main(String[] args) {
		
		int n1= 0;
		int n2= 1;
		int n3;
		int n;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kaç adet fibonacci saysını yazdırmak istersin?");
		n = scanner.nextInt();
		
		System.out.print(n1+" "+n2);
		
		for(int i = 2; i<n; i++) {
			n3 = n2+n1;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
			
		}
		
		
	}

}
