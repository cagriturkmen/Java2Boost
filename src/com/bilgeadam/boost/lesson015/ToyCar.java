package com.bilgeadam.boost.lesson015;

public class ToyCar {
		
	private int batteryCapacity=5;
	int distanceTravelledForward;
	int distanceTravelledRight;
	
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
	
	
	
}
