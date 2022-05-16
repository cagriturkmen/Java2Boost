package com.bilgeadam.boost.lesson021;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
		//1. Copying ArraysUsing Assignment Operator
		
		int [] numbers = {1,2,3,4,5,6};
		int [] positiveNumbers = numbers;
		
		for(int number: positiveNumbers) {
			//System.out.print(number+", ");
		}
		System.out.println(numbers);
		System.out.println(positiveNumbers);
		
		//2. Using Looping Construct to Copy Arrays
		int [] source = {1,2,3,4,5,6};
		int destination[] = new int[source.length];
		//iterate and copy elements from source to destination
		for (int i = 0; i < source.length; i++) {
			destination[i] = source[i];
		}
		System.out.println(source);
		System.out.println(destination);
		System.out.println(Arrays.toString(destination));
		
		//3. Copying Arrays Using arraycopy() method
		// arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		
		int[] n1= {2,3,4,12,12,-1};
		int[] n3 = new int[5];
		
		int[] n2 = new int[n1.length];
		//copyying entire n1 array to n2
		System.arraycopy(n1, 0, n2, 0, n1.length);
		System.out.println(Arrays.toString(n2));
		
		//copying elements from index 2 on n1 array
		//copying element to index 1 of n3 array
		//2 elements will be copied
		System.arraycopy(n1, 2, n3, 1,2);
		System.out.println(Arrays.toString(n3));
	
	}

}
