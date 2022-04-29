package com.bilgeadam.boost.lesson014;

public class StaticTest2 {

	public static void main(String[] args) {
		//static test sınıfından bir nesne oluşturdum
		StaticTest st = new StaticTest();
		//oluşturduğum nesne üzerinden multiply metoduna eriştim.(Çünkü multiply methodu static değildi.)
		System.out.println(st.multiply(2, 2));
		
		//add methoduna statik olduğu için doğrudan ulaştım.(Herhangi bir nesne yaratmaya gerek kalmadan)
		System.out.println(StaticTest.add(2, 3));
		
	}

}
