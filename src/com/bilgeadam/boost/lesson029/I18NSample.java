package com.bilgeadam.boost.lesson029;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18NSample {

	public static void main(String[] args) {
		
		String language;
		String country;
		
		if(args.length !=2) {
			language = new String();
			country = new String();
		}else {
			language = new String(args[0]);
			country = new String(args[1]);
		}
		
		
		Locale currentLocale = new Locale(language,country);
		
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle",currentLocale);
		
		System.out.println(messages.getString("greetings"));
		System.out.println(messages.getString("inquiry"));
		System.out.println(messages.getString("farewell"));

		
		
	}

}
