package com.bilgeadam.boost.lesson013;

public class GetterSetterTest {

	public static void main(String[] args) {
		
		GettersSetters testObject = new GettersSetters();
		GettersSetters testObject2 = new GettersSetters();
		
		
		testObject.setName("Cagri");
		testObject2.setName("Hande");
		
		
		System.out.println(testObject.getName());
		System.out.println(testObject.getLastname());
		
	}

}
