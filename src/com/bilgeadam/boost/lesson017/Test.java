package com.bilgeadam.boost.lesson017;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		Computer computer = new Computer();
		computer.setBrand("Apple");
		computer.setRamSize(16);
		computer.setScreenSize(13.2);
		//computer.showFeatures();
		
		Computer computer2 = new Computer("Monster",32,13);
		//computer2.showFeatures();
		computer2.connectWeb();
	
		Laptop laptop = new Laptop();
		laptop.setBrand("Msi");
		laptop.setRamSize(16);
		laptop.setScreenSize(12);
		laptop.setColor("Purple");
		laptop.setBatteryCapacity(85);
		//laptop.showFeatures();
		laptop.connectWeb();

		
		Desktop desktop = new Desktop();
		desktop.setBrand("Casper");
		desktop.setRamSize(16);
		
		
		Computer laptop2 = new Laptop();	
		
	}

}
