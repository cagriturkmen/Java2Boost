package com.bilgeadam.boost.lesson022;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAsQueue {

	public static void main(String[] args) {
		
		Queue<String> languages = new LinkedList<>();
		
		languages.add("Java");
		languages.add("Python");
		languages.add("C");
		
		System.out.println(languages);
		
		//access the first element
		String language = languages.peek();
		System.out.println(language);
		
		//access and remove the first element
		String lng = languages.poll();
		System.out.println(lng);
		System.out.println(languages);
		
		languages.offer("JavaScript");
		System.out.println(languages);

		
	}

}
