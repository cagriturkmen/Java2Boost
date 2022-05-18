package com.bilgeadam.boost.lesson023.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaMaps {

	public static void main(String[] args) {
		
		//creating a map using the hashmap
		Map<String, Integer> numbers = new HashMap<>();
		
		//Insert elements to the map
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Eight", 8);

		System.out.println("Map: " +numbers);
		
		//Access keys of the map
		System.out.println("Keys: "+numbers.keySet());
		
		//Access values of the map
		System.out.println("Values: "+numbers.values());
		
		//Access entries of the map
		System.out.println(numbers.entrySet());
		
		int value = numbers.remove("Eight");
		System.out.println("Removed value: "+ value);
		System.out.println(numbers.entrySet());
		
		
		//-----------------------------------------------------------------------------------//
		//creating a map using the TreeMap
		
		Map<String, Integer> values = new TreeMap<>();
		//inserting elements
		values.put("Second", 2);
		values.put("First",1);
		System.out.println("TreeSet: "+values);
		//replacing the values
		values.replace("First", 22);
		values.replace("Second", 11);
		System.out.println("New TreeMap:" + values);
		
		//Remove elements
		int removedValue = values.remove("First");
		System.out.println("Removed value:" +removedValue);
	}

}
