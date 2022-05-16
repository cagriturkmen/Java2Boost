package com.bilgeadam.boost.lesson021;

import java.util.Arrays;

public class ArrayConcat {

	public static void main(String[] args) {
		
		int [] array1 = {1,2,3};
		int [] array2 = {4,5,6};
		
		//Example 1: Concatenate Two arrays using arraycopy
		
		int aLen = array1.length;
		int bLen = array2.length;
		int [] result = new int[aLen+bLen];
		
		System.arraycopy(array1, 0, result, 0, aLen);
		System.arraycopy(array2, 0, result, aLen, bLen);
		System.out.println(Arrays.toString(result));
		
		
		//Example 2: Concatenate Two Arrays without using arraycopy
		int length = array1.length + array2.length;
		
		int [] result2 = new int [length];
		int pos = 0;
		for (int element : array1) {
			result2[pos]=element;
			pos++;
		}
		for(int element: array2) {
			result2[pos]= element;
			pos++;
		}
		System.out.println(Arrays.toString(result2));
	}

}
