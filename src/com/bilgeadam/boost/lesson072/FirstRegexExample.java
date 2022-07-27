package com.bilgeadam.boost.lesson072;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstRegexExample {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("Java", Pattern.CASE_INSENSITIVE);
		
		Matcher matcher = pattern.matcher("I want to learn java .");
		
		boolean matchFound = matcher.find();
		
		if(matchFound) {
			System.out.println("Match found");
		}else {
			System.out.println("Match not found");
		}
	}

}
