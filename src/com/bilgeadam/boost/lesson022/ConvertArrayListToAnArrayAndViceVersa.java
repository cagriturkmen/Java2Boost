package com.bilgeadam.boost.lesson022;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayListToAnArrayAndViceVersa {

	public static void main(String[] args) {
		
		ArrayList<String> languages = new ArrayList<>();
		
		languages.add("Java");
		languages.add("Python");
		languages.add("C++");
		
		System.out.println(languages);
		
	//	System.out.println(languages.indexOf("Java"));;
		
		//Create a new array of String type
		String[] arr = new String[languages.size()];
		//Convert ArrayList into an array
		languages.toArray(arr);
		//access elements of the array
		for (String language : arr) {
			System.out.println(language);
		}
		
		//create an arrayList from an array
		ArrayList<String> languages2 = new ArrayList<>(Arrays.asList(arr));
		System.out.println(languages2);
	}

}
