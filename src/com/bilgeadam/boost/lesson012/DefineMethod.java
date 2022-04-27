package com.bilgeadam.boost.lesson012;

public class DefineMethod {

	public static void main(String[] args) {
		
//		int c= methodName(4,5);
//		System.out.println(c);
//		int d =someMethod();
//		System.out.println(c+d);
		String str= methodName("Cagri","Turkmen");
		System.out.println(str);
	}
	
	public static String methodName (String name, String lastname) {
		
		return "adı: "+name+" soyadı: "+lastname;
	}
	
	public static int someMethod() {
		
		return 5;
	}
	

}
