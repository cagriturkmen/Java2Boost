package com.bilgeadam.boost.lesson009;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
			
		int i,count=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kontrol etmek istediğiniz sayıyı giriniz: ");
		int n = scanner.nextInt();
		
		if(n==0||n==1) {
			System.out.println(n+" is not prime number");
		}else {
			for(i=2; i<n; i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(n+" is prime number.");
			}else
				System.out.println(n+" is not prime number");
		}
	}

}
