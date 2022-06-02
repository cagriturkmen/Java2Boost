package com.bilgeadam.boost.lesson031;

public class NamingAThread extends Thread {

	@Override
	public void run() {
			
		System.out.println("Current thread: " +Thread.currentThread().getName());
		System.out.println("running..");
		
	}
	
	public static void main(String[] args) {
		
		NamingAThread t1 = new NamingAThread();
		NamingAThread t2 = new NamingAThread();
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.start();
		t2.start();
		
		t1.setName("Cagri's Thread");
		System.out.println("After changing name : "+ t1.getName());
	}

}
