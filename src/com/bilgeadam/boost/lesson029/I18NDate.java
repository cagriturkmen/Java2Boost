package com.bilgeadam.boost.lesson029;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

//I18N ->
//l10N

public class I18NDate {

	public static void main(String[] args) {
		
		printDate(Locale.UK);
		printDate(Locale.US);
		printDate(Locale.FRANCE);
		
	}
	
	static void printDate(Locale locale) {
		
		DateFormat formatter = DateFormat.getDateInstance(DateFormat.DEFAULT,locale);
		Date currentDate = new Date();
		String date = formatter.format(currentDate);
		System.out.println(date+" "+locale);
		
	}
	
}
