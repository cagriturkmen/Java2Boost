package com.bilgeadam.boost.lesson014;

public class StaticExample2 {

	public static void main(String[] args) {
		
		StaticExample obj = new StaticExample();
		//statik olmayan değişkene eriştim.
		System.out.println(obj.min+1);
		
		//statik değişkene eriştim.
		System.out.println(StaticExample.max);
		
	}

}
