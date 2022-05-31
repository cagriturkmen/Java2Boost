package com.bilgeadam.boost.lesson029;

import java.util.Locale;

public class DefaultLocale {

	public static void main(String[] args) {
		
		Locale locale = new Locale("tr","TR");
		
		System.out.println(locale.getDisplayCountry());
		System.out.println(locale.getDisplayLanguage());
		System.out.println(locale.getDisplayName());
		System.out.println(locale.getISO3Country());
		System.out.println(locale.getISO3Language());
		System.out.println(locale.getLanguage());
		System.out.println(locale.getCountry());
		
	}

}
