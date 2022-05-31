package com.bilgeadam.boost.maraton.test;

import java.time.LocalDate;

import com.bilgeadam.boost.maraton.entity.Gender;
import com.bilgeadam.boost.maraton.entity.MarriageStatus;
import com.bilgeadam.boost.maraton.entity.Name;
import com.bilgeadam.boost.maraton.entity.Occupation;
import com.bilgeadam.boost.maraton.entity.PhoneNumber;
import com.bilgeadam.boost.maraton.entity.Student;

public class Test {

	public static void main(String[] args) {
		
		Student stu1 = new Student(new Name("First", "Mid", "Last"),
				Gender.MAN,18,Occupation.STUDENT,LocalDate.of(1998, 7, 13),
				LocalDate.of(2010, 7, 13),LocalDate.of(2015, 7, 13),
				new PhoneNumber(123412312, 123412312),MarriageStatus.MARRIED);
		
		System.out.println(stu1);
	}

}
