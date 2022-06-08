package com.bilgeadam.boost.lesson036.prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Employee Id: ");
		int eid = Integer.parseInt(br.readLine()) ;
		
		System.out.println("Enter Employee Name: ");
		String name= br.readLine() ;
		
		System.out.println("Enter Employee Occupation");
		String job = br.readLine();
		
		System.out.println("Enter employee.address : ");
		String address = br.readLine();
		
		System.out.println("Enter Employee Salary: ");
		double salary =Double.parseDouble(br.readLine()) ;
		
		EmployeeRecord e1 = new EmployeeRecord(eid, job, name, salary, address);
		e1.showRecord();
		
		EmployeeRecord e2 =  (EmployeeRecord) e1.getClone();
		
		e2.showRecord();
		
		
	}

}
