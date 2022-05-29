package com.bilgeadam.boost.lesson028.recursive;

import java.util.Scanner;

public class SumOfDigitsOfANumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		
		System.out.println("Sum of digits of " + num + " is "+ sum(num));
	}	
	
	public static int sum(int n) {
		
		return n==0 ? 0 : n%10+sum(n/10);
		//         sum(128) =  8 + 2 + 1 + 0    
		//			sum(12) =  2 + sum(1)
		//          sum(1) = 1 + sum(0)
		//			sum(0) = 0
	}

}
