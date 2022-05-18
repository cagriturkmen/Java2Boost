package com.bilgeadam.boost.lesson023.maps;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		
		
		HashMap<String, String> capitalCities = new HashMap<String,String>();
		
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Spain", "Madrid");
		capitalCities.put("USA", "Washington DC");
		System.out.println(capitalCities);
		
		String city = capitalCities.get("England");
		System.out.println(city);
		capitalCities.remove("England");

		//capitalCities.clear();
		System.out.println(capitalCities.size());
		
		System.out.println(capitalCities.containsKey("England"));
		System.out.println(capitalCities.containsValue("Berlin"));
		
		capitalCities.putIfAbsent("Turkey", "Ankara");
		
		
		for (String country : capitalCities.keySet()) {
			System.out.println(country);
		}	
		
		for (String capital : capitalCities.values()) {
			System.out.println(capital);
		}
		
		for (Entry<String, String> string : capitalCities.entrySet()) {
			System.out.println(string);
		}
		
	}

}
