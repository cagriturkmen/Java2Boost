package com.bilgeadam.boost.lesson031;

public class ThreadX implements Runnable{

	@Override
	public void run() {
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
