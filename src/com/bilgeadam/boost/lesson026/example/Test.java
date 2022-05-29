package com.bilgeadam.boost.lesson026.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


public class Test {

	public static void main(String[] args) {
		
		List<Employee> employeeList = new LinkedList<>();
		
		Manager m1 = new Manager("Deniz"   ,"Denizli","M",20000);
		Manager m2 = new Manager("Serli"   ,"Tarık","M",18000);
		Doctor  d1 = new Doctor("Banu"     ,"Tıplı","D",23000);
		Doctor  d2 = new Doctor("Demir"    ,"Demirok","D",16000);
		Doctor  d3 = new Doctor("Harry"    ,"Potter","D",10000);
		Nurse   n1 = new Nurse("Charles"   ,"Leclerc","N",8000);
		Nurse   n2 = new Nurse("Ilkay"     ,"Gundogan","N",7500);
		Nurse   n3 = new Nurse("Luna"      ,"Ust","N",8300);
		Nurse   n4 = new Nurse("Erşan"     ,"Kuneri","N",6600);
		Janitor j1 = new Janitor("Mevsim"  ,"Ruzgarlari","J",6000);
		Janitor j2 = new Janitor("Ne Zaman","Eserse","J",4500);
		
		employeeList.add(m1);
		employeeList.add(m2);
		employeeList.add(d1);
		employeeList.add(d2);
		employeeList.add(d3);
		employeeList.add(n1);
		employeeList.add(n2);
		employeeList.add(n3);
		employeeList.add(n4);
		employeeList.add(j1);
		employeeList.add(j2);
	
		
		System.out.println(m1.increaseSalary(m1.getSalary()));;
		
		List<Employee> doctorList  =  employeeList.stream()
		.filter(employee -> employee.getJob().equalsIgnoreCase("D"))
		.collect(Collectors.toList());
		
		System.out.println(doctorList.getClass());
		
		for (Employee employee2 : doctorList) {
			System.out.println(employee2);
		}
	
		
	}

}
