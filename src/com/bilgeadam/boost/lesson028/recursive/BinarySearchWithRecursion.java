package com.bilgeadam.boost.lesson028.recursive;

public class BinarySearchWithRecursion {

	public static void main(String[] args) {
		
		int[] numbers = { 10, 15, 24, 33, 37, 41, 44, 67, 96, 100};

		
		System.out.println(recursiveBinarySearch(numbers, 67, 0, 9));
		
		recursiveBinarySearch(numbers, 67, 5, 9);
		
	}
	
	public static int recursiveBinarySearch(int[] data, int searchValue, int low, int high) {
		
		if(low>high) {
			return -1;
		}else {
			int mid = (low+high)/2;
			if(searchValue== data[mid]) {
				return mid;
			}else if(searchValue< data[mid]) {
				return recursiveBinarySearch(data,searchValue,low,mid-1);
			}else {
				return recursiveBinarySearch(data, searchValue,mid+1, high);
			}
		}
		
		
	}

}
