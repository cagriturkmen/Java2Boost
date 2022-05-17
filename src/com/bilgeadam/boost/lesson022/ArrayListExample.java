package com.bilgeadam.boost.lesson022;

import java.util.ArrayList;
import java.util.List;

//Vectorler yerine ArrayList kullanılması öneriliyor.(vector synchronized)

public class ArrayListExample {

	public static void main(String[] args) {
		
		//Creating list using the ArrayList class
		List<Integer> numbers = new ArrayList<>();
		
		//Add element
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		System.out.println("List:"+ numbers);
		
		//Access element
		System.out.println(numbers.get(2));
		
		//Remove element
		int removedNumber = numbers.remove(0);
		System.out.println("Removed number: "+removedNumber);
		System.out.println(numbers);
		
	}

}
