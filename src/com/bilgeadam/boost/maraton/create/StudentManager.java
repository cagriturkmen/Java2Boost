package com.bilgeadam.boost.maraton.create;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.bilgeadam.boost.maraton.entity.Gender;
import com.bilgeadam.boost.maraton.entity.MarriageStatus;
import com.bilgeadam.boost.maraton.entity.Name;
import com.bilgeadam.boost.maraton.entity.Occupation;
import com.bilgeadam.boost.maraton.entity.PhoneNumber;
import com.bilgeadam.boost.maraton.entity.Student;
import com.bilgeadam.boost.maraton.exception.MarriageStatusException;
import com.bilgeadam.boost.maraton.exception.StudentException;

public class StudentManager {

	public List<Student> createStudent() {
		List<Student> studentList = new ArrayList<>();
		
		try {
			Student stu1 = null;
			try {
				stu1 = new Student(new Name("First", "Mid", "Last"),
						Gender.MAN,18,Occupation.STUDENT,LocalDate.of(1998, 7, 13),
						LocalDate.of(2010, 7, 13),LocalDate.of(2015, 7, 13),
						new PhoneNumber(123412312, 123412312),MarriageStatus.SINGLE);
			} catch (StudentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Student stu2 = null;
			try {
				stu2 = new Student(new Name("Cagri", "Turkmen"),
						Gender.MAN,18,Occupation.STUDENT,LocalDate.of(1998, 7, 13),
						LocalDate.of(2010, 7, 13),LocalDate.of(2015, 7, 13),
						new PhoneNumber(123412312, 123412312),MarriageStatus.SINGLE);
			} catch (StudentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			studentList.add(stu1);
			studentList.add(stu2);
			

		} catch (MarriageStatusException e) {
			e.getMessage();
		}
		return studentList;
		
	}
	
	public void listStudents() {
		List<Student> studentList = createStudent();
		for (Student student : studentList) {
			System.out.println(student);
		}
	}
	
}
