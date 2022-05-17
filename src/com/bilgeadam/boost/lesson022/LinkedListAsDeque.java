package com.bilgeadam.boost.lesson022;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListAsDeque {

	public static void main(String[] args) {
		
		Deque<String> animals = new LinkedList<>();
		
		animals.add("Cow");
		System.out.println(animals);
		//add elements to end
		animals.addLast("Zebra");
		System.out.println(animals);
		animals.add("Cat");
		//add elements to beginning
		animals.addFirst("Dog");
		//removes and return the first element of deque
		//String animal = animals.pop();
		animals.removeFirst();
		animals.removeLast();
		//System.out.println(animal);
		System.out.println(animals);
		
	}

}
