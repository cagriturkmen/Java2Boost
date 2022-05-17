package com.bilgeadam.boost.lesson022;

import java.util.LinkedList;

//Search işlemleri yapılırken arrayList daha hızlı çalışır.
//Liste içinde manipülasyon veri ekleme mevcut veriyi değşştirme işlemlerinde LinkedList daha hızlı çalışıyor.

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> numbers = new LinkedList<>();
		
		numbers.add("One");
		numbers.add("Two");
		numbers.add("Three");
		numbers.add("Two");
		
		System.out.println("Numbers: "+numbers);
		numbers.get(2);
		System.out.println(numbers.indexOf("Two"));
		System.out.println(numbers.lastIndexOf("Two"));
		
		numbers.remove(3);
		System.out.println("Numbers: "+numbers);

	}

}
