package com.bilgeadam.boost.lesson015;

public class Laptop {
		
	private String brand;
	private int ramSize;
	private double screenSize;
	private int batteryCapacity;
	private ToyCar toyCar;
	
	void race() {
		ToyCar toyCar = new ToyCar();
		toyCar.initToyCar();
		
	}
	
	void connectWeb() {
		System.out.println(brand+" internete bağlandı.");
	}
	
	void showFeatures() {
		System.out.println("Brand= "+brand+","+"ramSize= "+ramSize+","+"screenSize= "+screenSize);
	}
	
	void remainingBattery() {
		System.out.println("Kalan Batarya: %"+batteryCapacity);
	}

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

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	
	
	
}
