package com.bilgeadam.boost.lesson018;

public abstract class Employee {
	
	private String name;
	private String address;
	private int number;
	
	//All args constructor
	public Employee(String name, String address, int number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	public abstract double computePay();
	
	public abstract void mailCheck();
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", number=" + number + "]";
	}

	//Getter Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
	
}
