package com.bilgeadam.boost.lesson017;

public class Computer {
	
	private String brand;
	private int ramSize;
	private double screenSize;
	
	public Computer() {
		
	}	
	
	public Computer(int ramSize, double screenSize) {
		this.ramSize = ramSize;
		this.screenSize = screenSize;
	}	
	
	public Computer(String brand, int ramSize, double screenSize) {
		this(ramSize, screenSize);
		this.brand = brand;
		
	}

	void connectWeb() {
		System.out.println(brand +" internete baglandi.");
	}
	void runProgram(String program) {	
		System.out.println(brand + program + "programini calistirdi.");	
	}
	void showFeatures() {

		System.out.println( "Computer [brand=" + brand + ", ramSize=" + ramSize + ", screenSize=" + screenSize + "]");
		
	}	

	//Getters and Setters
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRamSize() {
		return ramSize;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	
	
}
