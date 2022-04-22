package com.bilgeadam.boost.lesson010;

public class TriangleWithStars {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i+=2) {
			int count=0;
			do {
				System.out.print("*");
				count++;
			} while (count<i);
			System.out.println();
		}
		
	}

}
