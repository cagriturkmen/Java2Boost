package com.bilgeadam.boost.lesson027;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BirthDayExample {

	public static void main(String[] args) {
		
		DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		DateTimeFormatter shortFormat = DateTimeFormatter.ofPattern("MMMM dd");
		
		System.out.println("Bugün: " + LocalDate.now().format(inputFormat));
		
		while(true) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen dogum gununuzu giriniz. (dd.MM.yyyy) formatında giriniz.");
		String input = scanner.nextLine();
		
		LocalDate birthDate = LocalDate.parse(input,inputFormat);
		
		if(birthDate.isAfter(LocalDate.now())) {
			System.err.println("Daha dogmadiniz.");
			
		}
		
		System.out.println(birthDate.format(inputFormat)+ "harika bir gundu.");
		System.out.println(birthDate.getDayOfWeek()+ "gunu dogdunuz.");
		
		long days = birthDate.until(LocalDate.now(), ChronoUnit.DAYS);
		long weeks =birthDate.until(LocalDate.now(), ChronoUnit.WEEKS);
		long months = birthDate.until(LocalDate.now(), ChronoUnit.MONTHS);
		long years = birthDate.until(LocalDate.now(), ChronoUnit.YEARS);
		long decades = birthDate.until(LocalDate.now(), ChronoUnit.DECADES);
		long mileniums = birthDate.until(LocalDate.now(), ChronoUnit.MILLENNIA);
		
		System.out.println("Bugüne dek "+ days+ "gun" +weeks+"hafta"+" yasadiniz.");
		
		LocalDate nextBDate = birthDate.plusYears(years+1);
		System.out.println("Bir sonraki dogumgununuz " + nextBDate.format(inputFormat));
		System.out.println("Kutlamaya daha " + LocalDate.now().until(nextBDate, ChronoUnit.DAYS)+ "gun beklemeniz gerek");
		
		LocalDate halfBDate = birthDate.plusMonths(6);
		System.out.println("Yarim yaslarinizi: "+ halfBDate.format(shortFormat)+ "tarihinde kutluyorsunuz.");
	}
	}
}
