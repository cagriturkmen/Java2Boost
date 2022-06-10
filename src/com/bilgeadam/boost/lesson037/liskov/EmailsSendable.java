package com.bilgeadam.boost.lesson037.liskov;

import java.util.List;

public interface EmailsSendable {
	public void sendTripInfoMailToDrivers(List<CarDriver> drivers);
}
