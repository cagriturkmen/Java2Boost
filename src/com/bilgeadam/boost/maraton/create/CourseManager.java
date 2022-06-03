package com.bilgeadam.boost.maraton.create;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.List;

import com.bilgeadam.boost.maraton.entity.Course;
import com.bilgeadam.boost.maraton.entity.Employee;
import com.bilgeadam.boost.maraton.entity.Student;
import com.bilgeadam.boost.maraton.exception.TeacherException;

public class CourseManager {
	
	public void createCourse(Employee mt ,Employee at, List<Student> studentList) throws TeacherException {
		
		Course java = new Course("Java",2020,4,DayOfWeek.MONDAY,LocalTime.of(13, 0));
		Course dotnet = new Course(".Net",2015,4,DayOfWeek.MONDAY,LocalTime.of(13, 0));
	}
	
}
