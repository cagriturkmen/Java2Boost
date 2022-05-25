package com.bilgeadam.boost.lesson025;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IllegalStateExceptionExample {

	public static void main(String[] args) {
		
		processArray();
		
	}
	
	public static void processArray() {
		
		List names = new ArrayList<>();
		names.add("Erşan");
		names.add("Kuneri");
		
		Iterator iterator = names.iterator();
		
		try {
			while(iterator.hasNext()) {
				iterator.remove();
			}
		} catch (IllegalStateException e) {
		
		System.out.println("Gotcha");
		}
		
		
	}

}
