package com.bilgeadam.boost.lesson015;

import java.util.Scanner;

public class ToyCarTest {

	public static void main(String[] args) {
		
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
}
