package com.bilgeadam.boost.lesson012;

public class FindMinimum {

	public static void main(String[] args) {
		
		System.out.println(minFunction(2,7));
		
	}
	
	public static int minFunction(int n1, int n2) {
		int min;
		if(n1>n2)
			min=n2;
		else
			min=n1;
		
		return min;
	}

}
