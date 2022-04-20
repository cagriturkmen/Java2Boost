package com.bilgeadam.boost.lesson008;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
			
		double height, weight, bmi;
		String gender;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kilonuzu giriniz: ");
		weight = scanner.nextDouble();
		System.out.println("Boyunuzu giriniz: ");
		height = scanner.nextDouble();
		//scanner.nextLine();
		System.out.println("Cinsiyetinizi giriniz (K/E): ");
		gender = scanner.next();
		
		bmi= (weight*10000)/Math.pow(height, 2);
		
		if(gender.equals("K")) {
			if(bmi<19) {
				System.out.println("Zayıfsın. ");
			}else if(bmi<24) {
				System.out.println("Normalsin");
			}else if(bmi<30) {
				System.out.println("Kilolusun.");
			}else {
				System.out.println("Obezsin");
			}
		}else if(gender.equalsIgnoreCase("E")) {
			if(bmi<20) {
				System.out.println("Zayıfsın. ");
			}else if(bmi<25) {
				System.out.println("Normalsin");
			}else if(bmi<30) {
				System.out.println("Kilolusun.");
			}else {
				System.out.println("Obezsin");
			}
		}else {
			System.out.println("Hatalı giriş!!!");
		}
		
	}
}
