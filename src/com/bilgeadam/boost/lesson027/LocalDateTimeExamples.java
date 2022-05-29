package com.bilgeadam.boost.lesson027;

import java.time.LocalDateTime;

public class LocalDateTimeExamples {

	public static void main(String[] args) {
		
		LocalDateTime currentLocalDateTime = LocalDateTime.now();
		System.out.println(currentLocalDateTime);
		
		currentLocalDateTime = LocalDateTime.parse("2019-06-21T23:53:00.123");
		
		System.out.println(currentLocalDateTime);
		
		currentLocalDateTime = currentLocalDateTime.minusYears(10);
		System.out.println(currentLocalDateTime);
		
	}

}
