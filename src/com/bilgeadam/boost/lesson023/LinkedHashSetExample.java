package com.bilgeadam.boost.lesson023;

import java.util.LinkedHashSet;

//Verileri eklediğimiz sırada alıyoruz.

public class LinkedHashSetExample {
	
	
	public static void main(String[] args) {

		LinkedHashSet<String> days = new LinkedHashSet<>();
		
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		days.add("Sunday");
		
		boolean status = days.remove("Sunday");
		System.out.println(status);
		for (String day : days) {
			System.out.println(day);
		}
	}

}
