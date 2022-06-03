package com.bilgeadam.boost.maraton.entity;

import java.util.List;
import java.util.stream.Collectors;

public class School {
	
	private List<Employee> employees;
	private List<Student> students;
	private List<Course> lessons;
	
	public School(List<Employee> employees, List<Student> students, List<Course> lessons) {
		this.employees = employees;
		this.students =  students;
		this.lessons =  lessons;
	}

	public Student getStudent(String id) {
		return this.students.stream().filter(i -> i.getId().equalsIgnoreCase(id)).collect(Collectors.toList()).get(0);
	}
	
	public void addEmployee(Employee employee) {
		this.employees.add(employee);
	}

	public void addStudent(Student student) {
		this.students.add(student);
	}

	public void addLesson(Course course) {
		this.lessons.add(course);
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public List<Student> getStudents() {
		return students;
	}

	public List<Course> getLessons() {
		return lessons;
	}
	
	
	
}
