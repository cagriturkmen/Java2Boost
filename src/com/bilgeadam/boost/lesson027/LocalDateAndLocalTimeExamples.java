package com.bilgeadam.boost.lesson027;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateAndLocalTimeExamples {

	public static void main(String[] args) {
		
		LocalDate currentLocalDate = LocalDate.now();
		
		System.out.println("Today: " + currentLocalDate);
		
		LocalDate ld27022017 = LocalDate.of(2017, 2, 27);
		System.out.println(ld27022017);
		
		String date = "2017/02/27";
		LocalDate fLd27022017 = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		System.out.println(fLd27022017);
		
		ld27022017 = ld27022017.minusMonths(1);
		System.out.println(ld27022017);
		
		LocalTime cuurentLocalTime = LocalTime.now();
		System.out.println(cuurentLocalTime);
		
		LocalTime parseLocalTime = LocalTime.parse("13:44");
		System.out.println(parseLocalTime);
		
		parseLocalTime = LocalTime.parse("13:44:25");
		System.out.println(parseLocalTime);
		
	}

}
