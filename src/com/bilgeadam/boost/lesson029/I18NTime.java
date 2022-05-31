package com.bilgeadam.boost.lesson029;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class I18NTime {

	public static void main(String[] args) {
		
		printTime(Locale.CANADA);
		printTime(Locale.US);
		printTime(Locale.GERMANY);

		
	}
	
static void printTime(Locale locale) {
		
		DateFormat formatter = DateFormat.getTimeInstance(DateFormat.DEFAULT,locale);
		Date currentDate = new Date();
		String time = formatter.format(currentDate);
		System.out.println(time+" "+locale);
		
	}
	
}
