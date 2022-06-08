package com.bilgeadam.boost.lesson036.builder;

public class Test {

	public static void main(String[] args) {
		
		Computer computer = new Computer.ComputerBuilder("500 GB", "2GB")
				.setBluetoothEnabled(true).build();
		System.out.println(computer);
		
	}

}
