package com.bilgeadam.boost.lesson027;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

	public static void main(String[] args) {
		
		ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), ZoneId.systemDefault());
		System.out.println(zonedDateTime);
		
		ZoneId australiaSydneyZonedId = ZoneId.of("Australia/Sydney");
		
		ZonedDateTime australiaSydneyZonedDateTime = ZonedDateTime.of(LocalDateTime.now(), australiaSydneyZonedId);
		System.out.println(australiaSydneyZonedDateTime);
		
		
	}

}
