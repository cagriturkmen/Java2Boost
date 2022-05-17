package com.bilgeadam.boost.lesson022;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//List'i implements eden sınıflar ArrayList/LinkedList/Vector/Stack

public class JavaList {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		
		list1.add("Cagri");
		list1.add("Babur");
		list1.add("Cagri");
		
		//list1.set(0,"Hamit");
		
		//list1.remove(0);
		//list1.clear();
		list2.addAll(list1);
		System.out.println(list1);
		//System.out.println(list1.get(0));
		System.out.println(list1.size());
		System.out.println(list1.contains("Babür"));
		
		
		//System.out.println(list1);
		//System.out.println(list2);
		
	}

}
