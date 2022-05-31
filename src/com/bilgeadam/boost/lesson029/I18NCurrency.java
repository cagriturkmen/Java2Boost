package com.bilgeadam.boost.lesson029;

import java.text.NumberFormat;
import java.util.Locale;

public class I18NCurrency {

	public static void main(String[] args) {
		
		printCurrency(Locale.UK);
		printCurrency(Locale.US);
		printCurrency(Locale.FRANCE);
		printCurrency(Locale.JAPAN);
	}
	
	static void printCurrency(Locale locale) {
		
		double dbl = 10500.3245;
		NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
		String currency = formatter.format(dbl);
		System.out.println(currency +" "+ locale);
		
	}
	
}
