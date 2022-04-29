package com.bilgeadam.boost.lesson015;

public class LaptopTest {

	public static void main(String[] args) {
		
		Laptop laptop = new Laptop();
		
		laptop.setBrand("Monster");
		laptop.setRamSize(16);
		laptop.setScreenSize(12.2);
		laptop.setBatteryCapacity(100);
		laptop.showFeatures();
		laptop.race();
		
//		laptop.connectWeb();
//		laptop.remainingBattery();
//		
//		Laptop laptop2 = new Laptop();
//		laptop2.setBrand("Dell");
//		laptop2.setRamSize(32);
//		laptop2.setScreenSize(13.1);
//		laptop2.setBatteryCapacity(40);
//		
//		laptop2.connectWeb();
//		laptop2.showFeatures();
//		laptop2.remainingBattery();
//		
//		String str = laptop2.getBrand();
//		System.out.println(str);
	}

}
