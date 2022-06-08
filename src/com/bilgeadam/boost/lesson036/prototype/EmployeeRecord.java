package com.bilgeadam.boost.lesson036.prototype;

public class EmployeeRecord implements Prototype {
	
	private int id;
	private String occupation;
	private String name;
	private double salary;
	private String address;
	
	
	public EmployeeRecord(int id, String occupation, String name, double salary, String address) {
		this.id = id;
		this.occupation = occupation;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public void showRecord() {
		System.out.println("EmployeeRecord [occupation=" + occupation + ", name=" + name + ", salary=" + salary + ", address="
				+ address + "]");
	}
	

	@Override
	public Prototype getClone() {

		return new EmployeeRecord(id,occupation,name,salary,address);
	}

}
