package com.bilgeadam.boost.lesson027;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAndCalendarExample {

	public static void main(String[] args) {
		
		Date today = new Date();
		System.out.println("Today: " + today);
		
		// yıl için -1900
		Date d27022017 = new Date(117,1,27);
		System.out.println("27022017 :"+ d27022017);
		
		Calendar c27022017 = new GregorianCalendar(2017,1,27);
		System.out.println("27022017 :"+ c27022017.getTime());
		
		DateFormat ddMMyyy = new SimpleDateFormat("dd/MMMM/yyy");
		System.out.println(ddMMyyy.format(d27022017));
		
	}

}
