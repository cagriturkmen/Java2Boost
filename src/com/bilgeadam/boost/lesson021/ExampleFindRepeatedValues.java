package com.bilgeadam.boost.lesson021;

public class ExampleFindRepeatedValues {

	public static void main(String[] args) {
		
		int [] arr = {3,7,12,43,54,43,28,3,19,-24,-19};	
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}	
		
	}

}
