package com.bilgeadam.boost.lesson020.interfaces.multipleineritance;

public class A5 implements Printable, Showable {

	@Override
	public void show() {
		System.out.println("Show A5");
	}

	@Override
	public void print() {
		System.out.println("Print A5");		
	}

}
