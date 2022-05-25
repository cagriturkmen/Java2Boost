package com.bilgeadam.boost.lesson025;

import java.util.HashMap;
import java.util.Map;

public class ErathosthenesPrimeNumbers {

	public static void main(String[] args) {
		
		erathostenesFormula(100);
		
	}
	
	static void erathostenesFormula(int n) {
		
		Map<Integer, Boolean> numbers = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
			numbers.put(i, true);
			numbers.put(0, false);
			numbers.put(1, false);
		}
		
		for (int j=2; j < n ; j++) {
			if (numbers.get(j)== true) {
				for(int i = j*2 ; i<n; i+=j) {
					numbers.put(i, false);
				}
			}
		}
		System.out.println(numbers);
	}

}
