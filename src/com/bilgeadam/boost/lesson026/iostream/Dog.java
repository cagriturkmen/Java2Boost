package com.bilgeadam.boost.lesson026.iostream;

import java.io.Serializable;

public class Dog implements Serializable{
	
	
	private static final long serialVersionUID = 2242315641878877624L;
	
	String name;
	String breed;
	
	public Dog(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}
	
	
	
}
