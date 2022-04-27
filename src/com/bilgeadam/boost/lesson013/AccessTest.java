package com.bilgeadam.boost.lesson013;

public class AccessTest {

	public static void main(String[] args) {
		
		Test testObject = new Test();
		
		System.out.println("Erisebildgim degiskenleer: "+testObject.publicVariable+","
		+testObject.protectedVariable+","+testObject.defaultVariable);
		
	}

}
