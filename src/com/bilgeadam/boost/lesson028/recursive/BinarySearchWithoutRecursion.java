package com.bilgeadam.boost.lesson028.recursive;

public class BinarySearchWithoutRecursion {
	
	public static void main(String[] args) {
		
		int[] numbers = { 10, 15, 24, 33, 37, 41, 44, 67, 96, 100};
			
		System.out.println("Position of 33 in this array is "+ binarySearch(numbers, 108));;
		
	}
	
	
	public static int binarySearch(int[] data, int searchValue) {
		
		int left = 0;
		int right = data.length -1;
		while(left<= right) {
			
			int mid = (left+right) / 2;
			
			if(searchValue == data[mid]) {
				return mid;
			}else if (searchValue< data[mid]) {
				right = mid -1;
			}else {
				left = mid + 1;
			}
		}
		
		return -1;
	}

}
