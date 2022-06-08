package com.bilgeadam.boost.lesson036.singleton;

public class Test {

	public static void main(String[] args) {
		
		LazyInitializedSingleton singleton1 = LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton singleton2 = LazyInitializedSingleton.getInstance();
	

		
		System.out.println(singleton1);
		System.out.println(singleton2);
		
	}

}
