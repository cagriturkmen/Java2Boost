package com.bilgeadam.boost.lesson022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {
		
		//arrayleri tersten yazdırıyor..
//		String [] arr = {"a","b","c"};
//		Arrays.sort(arr,Collections.reverseOrder());
//		System.out.println(Arrays.toString(arr));


		ArrayList<String> list= new ArrayList<>();
		list.add("Cagri");
		list.add("Babur");
		list.add("Hakan");
		ArrayList<Integer> list2= new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);

		System.out.println(list);
		
		//Reversing given arrayList
		Collections.reverse(list);
		System.out.println("Reversed list:"+list);
		
		//Sorts an arrayList in ascending order
		Collections.sort(list);
		System.out.println("Sorted list:"+list);
		
		//Sorts an arrayList in descending order
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("Reverse Sorted List: "+list);
		
	}

}
