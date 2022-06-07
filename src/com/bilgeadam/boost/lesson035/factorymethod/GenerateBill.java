package com.bilgeadam.boost.lesson035.factorymethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

	public static void main(String[] args) throws IOException {
		
		PlanFactory planFactory = new PlanFactory();
		System.out.println("Enter the name of plan : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String planName = br.readLine();
		System.out.println("Enter the number of units :");
		int units = Integer.parseInt(br.readLine());
		
		Plan p = planFactory.getPlan(planName);
		
		System.out.println("Bill amount for " + planName+" of "+units+" units is: ");
		p.getRate();
		p.calculateBill(units);
		
	}

}
