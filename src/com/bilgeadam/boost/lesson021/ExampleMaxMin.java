package com.bilgeadam.boost.lesson021;

public class ExampleMaxMin {

	public static void main(String[] args) {
		
		int[] array = {56,34,1,8,101,-2,-33};
		
		int min = Integer.MAX_VALUE;
				
		int max = Integer.MIN_VALUE;	
		
		for (int i : array) {
			if(i<min) {
				min =i;
			}
			if(i>max) {
				max = i;
			}
		}
		System.out.println("Min. deger: "+min);
		System.out.println("Max. deger: "+max);
	}

}
