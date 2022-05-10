package com.bilgeadam.boost.lesson017.superlesson;

public class Dog extends Animal{

	String color ="black";
	
	void printColor()
	{
		System.out.println(this.color);
		System.out.println(super.color);
	}
}
