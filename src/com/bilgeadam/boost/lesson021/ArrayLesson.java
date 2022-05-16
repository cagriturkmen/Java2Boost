package com.bilgeadam.boost.lesson021;

import java.util.Arrays;

public class ArrayLesson {

	public static void main(String[] args) {
			
		// declare an array
		double[] data;
		
		//allocate memory
		data = new double[8];
		
		double[] data2 = new double[8];
		
		// declare and initialize an array
		int[] age  = {12,4,5,2,5};
		
		//declare an array
		int[] age2 = new int[5];
		//initialize an array
		age2[0] = 12;
		age2[1] = 4;
		age2[2] = 5;
		age2[3] = 2;
		age2[4] = 5;
		
		//access each array elements
		System.out.println("First element: "+ age[0]);
		System.out.println("Second element: "+ age[1]);
		System.out.println("Third element: "+ age[2]);
		System.out.println("Fourth element: "+ age[3]);
		System.out.println("Fifth element: "+ age[4]);
		
		//loop through the array
			//using for loop
		for(int i = 0; i<age.length ; i++) {
			//System.out.println(age[i]);
		}
		
			//using foreach loop
		for (int i : age) {
			System.out.println(i);
		}
		
		// Array.toString

		String temp =Arrays.toString(age);
		System.out.println(temp);
		
		
	}

}
