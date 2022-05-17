package com.bilgeadam.boost.lesson022;

import java.util.ArrayList;

//Array vs ArrayList 
/*
 Arrayler'in boyutunu önceden belirlemek gerekiyor.(statik)
 ArrayListler ise boyutunu kendisi ayarlıyor. (dinamik)
 ArrayListler dinamik arrayler olarak biliniyorlae.
 * */

public class ArrayListExample2 {

	public static void main(String[] args) {
		//create arrayList
		ArrayList<String> languages = new ArrayList<>();
		//add() method without the index parameter
		languages.add("Java");
		languages.add("C");
		languages.add("Python");
		
		System.out.println("Languages: "+languages);
		//get the element from the arraylist
		System.out.println(languages.get(1));;
		//change the element of the arrayList
		languages.set(2, "JavaScript");
		System.out.println("Languages: "+languages);
		//remove eleemnt at index 2
		languages.remove(2);
		System.out.println("Languages: "+languages);
		
		//iterate using for-each loop
		//Accessing individual elements
		for (String language : languages) {
			System.out.println(language);
		}
		

	}

}
