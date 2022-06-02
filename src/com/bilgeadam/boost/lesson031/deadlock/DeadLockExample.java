package com.bilgeadam.boost.lesson031.deadlock;

public class DeadLockExample {
	
	public static void main(String[] args) {
		

		String resource1 = "cagri";
		String resource2 = "Turkmen";
		
		Thread t1 = new Thread() {

			@Override
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 1 : locked resource1");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				synchronized (resource2) {
				System.out.println("Thread 1 : Locked resource2");	
				}
				}
			}
			
		};
		
		Thread t2 = new Thread() {

			@Override
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 2 : locked resource2");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				synchronized (resource2) {
				System.out.println("Thread 2 : Locked resource1");	
				}
				}
			}
			
		};
		
		t1.start();
		t2.start();
	}
	
	
	
}
