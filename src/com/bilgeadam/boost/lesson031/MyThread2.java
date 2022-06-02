package com.bilgeadam.boost.lesson031;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		
		System.out.println("Thread is running..");
		
	}
	
	public static void main(String[] args) {
		
		MyThread2 runnable = new MyThread2();
		
		Thread thread =new Thread(runnable, "My thread");
		
		thread.start();
		
		System.out.println(thread.getName());;
	}

}
