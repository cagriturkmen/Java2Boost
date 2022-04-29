package com.bilgeadam.boost.lesson015;

import java.util.Scanner;

public class ToyCar {
		
	private int batteryCapacity;
	int distanceTravelledForward;
	int distanceTravelledRight;
	
	
	
	public ToyCar() {
		super();
		this.batteryCapacity = 5;
		this.distanceTravelledForward = 0;
		this.distanceTravelledRight = 0;
	}
	public ToyCar(int batteryCapacity, int distanceTravelledForward, int distanceTravelledRight) {
		super();
		this.batteryCapacity = batteryCapacity;
		this.distanceTravelledForward = distanceTravelledForward;
		this.distanceTravelledRight = distanceTravelledRight;
	}
	
	void initToyCar() {
		ToyCar toyCar = new ToyCar();

		while(true) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("w-Move Forward\na-Move Left\ns-Move Backward\nd-Move Right\nc-Charge\nWhat is your move?");
		String move = scanner.nextLine();
		
		switch (move.toLowerCase()) {
		case "w":
			toyCar.moveOneMeterForward();
			break;
		case "a","A":
			toyCar.moveOneMeterLeft();
			break;
		case "s":
			toyCar.moveOneMeterBackward();
			break;
		case "d":
			toyCar.moveOneMeterRight();
			break;
		case "c":
			toyCar.charge();
			break;
		default:
			System.out.println("Invalid entry!!");
			break;
		}
	}
	}
	private void remainingBattery() {
		System.out.println("Remaining Battery: "+batteryCapacity);
		if(batteryCapacity<=0) {
			System.out.println("Dead Battery! Please charge!");
		}
	}
	void charge() {
		
		if(batteryCapacity>=5) {
			System.out.println("Battery Full!");
		}else {
			batteryCapacity++;
			remainingBattery();
		}
		
	}
	
	void moveOneMeterForward() {
		if(batteryCapacity<=0) {
			remainingBattery();
		}else {
		distanceTravelledForward++;
		batteryCapacity--;
		System.out.println("\nCurrent Position: "+distanceTravelledForward+","+distanceTravelledRight);
		remainingBattery();
		}
	}
	
	void moveOneMeterBackward() {
		if(batteryCapacity<=0) {
			remainingBattery();
		}else {
		distanceTravelledForward--;
		batteryCapacity--;
		System.out.println("\nCurrent Position: "+distanceTravelledForward+","+distanceTravelledRight);
		remainingBattery();
		}
	}
	void moveOneMeterRight() {
		if(batteryCapacity<=0) {
			remainingBattery();
		}else {
		distanceTravelledRight++;
		batteryCapacity--;
		System.out.println("\nCurrent Position: "+distanceTravelledForward+","+distanceTravelledRight);
		remainingBattery();
		}
	}
	void moveOneMeterLeft() {
		if(batteryCapacity<=0) {
			remainingBattery();
		}else {
		distanceTravelledRight--;
		batteryCapacity--;
		System.out.println("\nCurrent Position: "+distanceTravelledForward+","+distanceTravelledRight);
		remainingBattery();
		}
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public int getDistanceTravelledForward() {
		return distanceTravelledForward;
	}
	public void setDistanceTravelledForward(int distanceTravelledForward) {
		this.distanceTravelledForward = distanceTravelledForward;
	}
	public int getDistanceTravelledRight() {
		return distanceTravelledRight;
	}
	public void setDistanceTravelledRight(int distanceTravelledRight) {
		this.distanceTravelledRight = distanceTravelledRight;
	}
	
	
	
}
