package com.bilgeadam.boost.lesson023;

import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
		
		TreeSet<Student> students = new TreeSet<>(new OrderNamesComparator());
		Student stu = new Student(102, "Mustafa", 90);
		students.add(stu);
		students.add(new Student(101,"Cagri",15));
		students.add(new Student(104,"Babur",100));
		students.add(new Student(110,"Gulten",85));
		
		for (Student student : students) {
			System.out.println(student);
		}
		
	}

}
