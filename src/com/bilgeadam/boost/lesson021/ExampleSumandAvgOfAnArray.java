package com.bilgeadam.boost.lesson021;

public class ExampleSumandAvgOfAnArray {

	public static void main(String[] args) {
		
		int[] numbers = {2,-9,0,5,12,-25,22,9,8,12};
		int sum = 0 ;
		double average;
		
		for (int i = 0; i < numbers.length; i++) {
		//	sum += numbers[i];
		}
		
		for (int number : numbers) {
			sum += number;
		}
		
		int arrayLength = numbers.length;
		average = (double)sum / (double)arrayLength ;
		
		
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+average);
	}

}
