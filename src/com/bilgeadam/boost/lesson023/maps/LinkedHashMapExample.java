package com.bilgeadam.boost.lesson023.maps;

import java.util.LinkedHashMap;

import com.bilgeadam.boost.lesson023.Student;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer,Student> students = new LinkedHashMap<>();
		
		Student stu = new Student(102, "Mustafa", 90);
		students.put(4,stu);
		students.put(1,new Student(101,"Cagri",15));
		students.put(2,new Student(104,"Babur",100));
		students.put(3,new Student(110,"Gulten",85));
		
		for (Student student : students.values()) {
			System.out.println(student.getName());
		}
		
		Student stu2 = students.remove(101);
		System.out.println("Removed value:"+stu2);
		
		boolean result = students.remove(102,stu);
		System.out.println("Is the entry 102 removed? "+result);
		System.out.println("Updated LinkedHashMap: "+ students);
	}

}
