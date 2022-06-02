package com.bilgeadam.boost.lesson031;

public class ThreadState implements Runnable {

	public static Thread t1;
	public static ThreadState r1;
	
	
	@Override
	public void run() {
		
	ThreadX r2 = new ThreadX();
	Thread t2 = new Thread(r2);
		
	t2.start();
	System.out.println(t2.getState());
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	System.out.println(t2.getState());
	
	}
	
	
	public static void main(String[] args) {
		r1 = new ThreadState();
		t1 = new Thread(r1);
		
		System.out.println("Before starting t1: "+ t1.getState());
		t1.start();
		System.out.println("After starting t1: "+ t1.getState());
		

	}
}
