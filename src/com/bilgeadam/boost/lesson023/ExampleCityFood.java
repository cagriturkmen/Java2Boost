package com.bilgeadam.boost.lesson023;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExampleCityFood {

	public static void main(String[] args) {
		
		Map<Integer,String> cities = new HashMap<>();
		
		cities.put(01, "Adana");
		cities.put(33, "Mersin");
		cities.put(38, "Kayseri");
		cities.put(16, "Bursa");
		cities.put(02, "Adiyaman");
		
		Map<String,String> foods = new HashMap<>();
		foods.put("Adana", "Kebab");
		foods.put("Mersin", "Tantuni");
		foods.put("Kayseri", "Manti");
		foods.put("Bursa","Iskender");
		foods.put("Adiyaman", "CigKofte");
		
		System.out.println("Lütfen plaka no gir:");
		Scanner scanner = new Scanner(System.in);
		int cityNo = scanner.nextInt();
		
		String city = cities.get(cityNo);
		String food=foods.get(city);
		System.out.println(food);
		
	}

}
