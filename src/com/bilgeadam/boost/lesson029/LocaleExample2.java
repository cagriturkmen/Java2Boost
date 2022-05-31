package com.bilgeadam.boost.lesson029;

import java.util.Locale;

public class LocaleExample2 {

	public static void main(String[] args) {
		
		Locale enLocale = new Locale("en","US");
		Locale frLocale = new Locale("fr","FR");
		Locale esLocale = new Locale("es","ES");

		System.out.println("English in english: "+enLocale.getDisplayLanguage());
		System.out.println("English in french: "+ enLocale.getDisplayLanguage(frLocale));
		System.out.println("English in spanish: "+ enLocale.getDisplayLanguage(esLocale));

	}

}
