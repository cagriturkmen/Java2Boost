package com.bilgeadam.boost.lesson008;

import java.util.Scanner;

//ALAN = (n*s^2)/(4*tan(pi/n))​
public class Polygon {

	public static void main(String[] args) {
		
		int n;
		double s; 
		double square;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen kenar sayısını giriniz: ");
		n = scanner.nextInt();
		System.out.println("Lütfen kenar uzunluğunu giriniz: ");
		s = scanner.nextDouble();
		
		square = (n*(Math.pow(s, 2)))/ (4*(Math.tan(Math.PI/n)));
		System.out.println(n+"gen alanı: "+square);

		
	}

}
