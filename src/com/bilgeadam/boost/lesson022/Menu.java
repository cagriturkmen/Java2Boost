package com.bilgeadam.boost.lesson022;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Menu {

	public static int randomlyPick(int number) {
		Random random = new Random();
		int randomChoice = random.nextInt(number);
		return randomChoice;
	}
	
	public static String days() {
		String [] day = new String[7];
		day[0] = " Monday";
		day[1] = " Tuesday";
		day[2] = " Wednesday";
		day[3] = " Thursday";
		day[4] = " Friday";
		day[5] = " Saturday";
		day[6] = " Sunday";
		
		return day[randomlyPick(day.length)];
	}
	
	public static List<String> mainCourses() {
		
		List<String> mainCourseList = new ArrayList<>();
		mainCourseList.add("Chicken");
		mainCourseList.add("Kebab");
		mainCourseList.add("Rice");
		mainCourseList.add("Manti");
		mainCourseList.add("Kuru fasulye");
		mainCourseList.add("Beef");
		
		return mainCourseList;
	}
	
	public static String randomMainCourse() {
		return mainCourses().get(randomlyPick(mainCourses().size()));
	}
	
	public static String sideCourses() {
		List<String> sideCourseList = new ArrayList<String>();
		sideCourseList.add("Chicken Soup");
		sideCourseList.add("Tomato Soup");
		sideCourseList.add("Yayla Soup");
		return sideCourseList.get(randomlyPick(sideCourseList.size()));
	}
	
	
	public static void main(String[] args) {
			
		String day = days();
		String mainCourse = randomMainCourse();
		String sideCourse = sideCourses();
		System.out.println(day +" "+ mainCourse +" "+ sideCourse);;
		
	}

}
