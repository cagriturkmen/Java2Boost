package com.bilgeadam.boost.lesson010;

import java.util.Scanner;

public class Hcf_Lcm {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen 1. sayıyı giriniz: ");
		int number1= scanner.nextInt();
		System.out.println("Lütfen 2. sayıyı giriniz: ");
		int number2= scanner.nextInt();
		int count;
		int hcf=1;
		int lcm=1;
		if(number1>number2) {
			count = number2;
		}else {
			count = number1;
		}
		
		while(count>0) {
			if( number1 % count== 0 && number2%count==0) {
				hcf = count;
				break;
			}
			count--;
			
		}
		count =1;
		while(count<= number1*number2) {
			count++;
			if(count%number1==0 && count%number2==0) {
				lcm = count;
				break;
			}
		}
		System.out.printf("%d ve %d sayısının ekoku= %d \n",number1,number2,lcm);
		System.out.println(number1+" "+number2+" ekok'u: "+lcm);
		System.out.println(number1+" "+number2+" ebob'u: "+hcf);

		
	}

}
