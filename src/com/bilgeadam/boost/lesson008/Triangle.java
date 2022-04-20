package com.bilgeadam.boost.lesson008;

import java.util.Scanner;
// ​c^2=a^2 + b^2 - 2abcos(C) 
public class Triangle {

	public static void main(String[] args) {
		
//		Math.cos
//		Math.pow(c,2)
//		Math.PI
		double x,y,z,a,b,c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("İlk açıyı giriniz: ");
		x = scanner.nextDouble();
		System.out.println("İkinci açıyı giriniz: ");
		y= scanner.nextDouble();
		System.out.println("İlk kenar uzunluğunu giriniz: ");
		a = scanner.nextDouble();
		System.out.println("İkinci kenar uzunluğunu giriniz: ");
		b = scanner.nextDouble();
		
		z= 180-(x+y);
		double zRad= Math.toRadians(z);
		double temp = Math.pow(a, 2) + (b*b) - (2*a*b*(Math.cos(zRad)));
		System.out.println(Math.pow(temp, 0.5));
		c=Math.sqrt(temp);
		System.out.println(c);
		System.out.println("3. açı: " + z );
		
	}

}
