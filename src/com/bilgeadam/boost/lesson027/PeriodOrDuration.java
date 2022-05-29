package com.bilgeadam.boost.lesson027;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodOrDuration {

	public static void main(String[] args) {
		
		//Period days,weeks,months,years
		Period examplePeriod = Period.of(1, 2, 3);
		System.out.println(examplePeriod);
		
		LocalDate localDate = LocalDate.now().plus(examplePeriod);
		System.out.println(localDate);
		
		
		//Duration - days hours minutes seconds
		Duration exampleDuration = Duration.ofHours(5);
		System.out.println(exampleDuration);
		
		LocalTime localTime = LocalTime.now().plus(exampleDuration);
		System.out.println(localTime);
		
		
	}

}
