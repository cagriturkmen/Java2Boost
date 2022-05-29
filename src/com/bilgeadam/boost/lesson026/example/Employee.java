package com.bilgeadam.boost.lesson026.example;

public abstract class Employee implements Accountable{
	
	private String name;
	private String lastname;
	private String job;
	private double salary;
	
	public Employee(String name, String lastname, String job, double salary) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.job = job;
		this.salary = salary;
	}
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [name=" + name + ", lastname=" + lastname + ", job=" + job + ", salary=" + salary + "]";
	}
	
	
}
