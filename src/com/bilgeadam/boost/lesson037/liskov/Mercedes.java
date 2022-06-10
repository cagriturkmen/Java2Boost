package com.bilgeadam.boost.lesson037.liskov;

import java.util.List;

public class Mercedes extends BaseCar implements SMSSendable,EmailSendable{
	
	
	
	@Override
	public double getCostPerKm() {
		// TODO Auto-generated method stub
		return 5;
	}

	public void sendTripInfoMailToDriver(CarDriver driver) {
		
		System.out.println("Email : some trip info...");
	}
	
	public void sendTripInfoMailToDrivers (List<CarDriver> drivers) {
		
		System.out.println("Emails : some trip info...");
		
	}

	@Override
	public void sendTripInfoSMSToDriver() {
		// TODO Auto-generated method stub
		
	}
 
	
	
	

}
