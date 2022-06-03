package com.bilgeadam.boost.maraton.entity;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.bilgeadam.boost.maraton.exception.TeacherException;

public class Course {
	
	private String name;
	private int year;
	private int duration;
	private DayOfWeek day;
	private LocalTime startTime;
	private Employee mainTeacher;
	private Employee assistantTeacher;
	private List<Student> studentList;
	
	
	

	public Course(String name, int year, int duration, DayOfWeek day, LocalTime startTime ) throws TeacherException {
		super();
		this.name = name;
		this.year = year;
		this.duration = duration;
		this.day = day;
		this.startTime = startTime;
		this.studentList = new ArrayList<>();
		
		
	}
	public void addStudent(Student student) {
		studentList.add(student);
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}
	

	public void setMainTeacher(Employee mainTeacher) throws TeacherException {
		if(!mainTeacher.getOccupation().toString().equals(Occupation.TEACHER.toString())) {
			throw new TeacherException();
		}
		this.mainTeacher = mainTeacher;
	}
	public void setAssistantTeacher(Employee assistantTeacher) throws TeacherException {
		if(!assistantTeacher.getOccupation().toString().equals(Occupation.TEACHER.toString())) {
			
			throw new TeacherException();
		}
		this.assistantTeacher = assistantTeacher;
	}
	public Employee getMainTeacher() {
		return  mainTeacher;
	}

	public Employee getAssistantTeacher() {
		return assistantTeacher;
	}

	public List<Student> getStudentList() {
		return studentList;
	}
	
	public int getDuration() {
		return duration;
	}

	public DayOfWeek getDay() {
		return day;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", year=" + year + ", mainTeacher=" + mainTeacher + ", assistantTeacher="
				+ assistantTeacher + ", studentList=" + studentList + "]";
	}
	
	
	
}
