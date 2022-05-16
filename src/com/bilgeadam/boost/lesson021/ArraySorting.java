package com.bilgeadam.boost.lesson021;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		
		int [] array = {3,7,12,43,54,43,28,3,19,-24,-19};
		
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[j] < array[i]) {
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
	//	System.out.println(Arrays.toString(array));
		for(int i = 0; i<array.length;i++) {
			System.out.println("Dizinin "+(i+1)+". elemani: "+ array[i] );
		}
	}

}
