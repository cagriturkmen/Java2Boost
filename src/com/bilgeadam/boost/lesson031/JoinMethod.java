package com.bilgeadam.boost.lesson031;

public class JoinMethod implements Runnable {

	@Override
	public void run() {
		
		for (int i = 1; i <= 5; i++) {
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		JoinMethod t1 = new JoinMethod();
		Thread thread1 = new Thread(t1);
		String t1name= thread1.getName();
		
		//JoinMethod t2 = new JoinMethod();
		Thread thread2 = new Thread(t1);
		
		//JoinMethod t3 = new JoinMethod();
		Thread thread3 = new Thread(t1);
		
		thread1.start();
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread2.start();
		
		thread3.start();
	
	}
	
}
