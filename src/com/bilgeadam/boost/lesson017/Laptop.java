package com.bilgeadam.boost.lesson017;

public class Laptop extends Computer {
	
	private int batteryCapacity;
	private String color;

	void stateOfCharge(int batteryCapacity) {
		
		if(batteryCapacity<20) {
			System.out.println(getBrand()+"Pil zayıf: "+batteryCapacity);
		}else {
			System.out.println(getBrand()+"Pil durumu: 0"+batteryCapacity);
		}
	}	
	
	@Override
	void connectWeb() {
		System.out.println(getBrand()+ " markalı LAPTOP internete bağlandı.");
	}
	

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	//getter setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
