package com.bilgeadam.boost.lesson012;

import java.util.Scanner;

public class IsEven {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num;
		
		System.out.println("Enter an integer: ");
		num = scanner.nextInt();
		
		if(isEven(num)) {
			System.out.println("Number is even");
		}else
			System.out.println("Number is odd");
		
	}
	
	public static boolean isEven(int number) {
		
		if(number%2 == 0) 
			return true;
		else 
			return false;
		
		
	}

}
