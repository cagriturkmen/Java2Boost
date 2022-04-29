package com.bilgeadam.boost.lesson014;

public class StaticTest {
	
	// non static method
	int multiply(int a, int b) {
		return a*b;
	}
	
	// static method
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		add(4,3);
		StaticTest st = new StaticTest();
		st.multiply(2, 3);
		//st.add(3, 4);
	}

}
