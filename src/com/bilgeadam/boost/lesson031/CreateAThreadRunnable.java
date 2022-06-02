package com.bilgeadam.boost.lesson031;

public class CreateAThreadRunnable implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Thread is running");
		
	}
	
	public static void main(String[] args) {
		
		CreateAThreadRunnable runnable = new CreateAThreadRunnable();
		Thread thread = new Thread(runnable);
		
		thread.start();
	}
	
}
