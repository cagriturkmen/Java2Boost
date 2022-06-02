package com.bilgeadam.boost.lesson031;

public class ThreadSleepMethod extends Thread {

	@Override
	public void run() {
		
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		ThreadSleepMethod thread1 = new ThreadSleepMethod();
		ThreadSleepMethod thread2 = new  ThreadSleepMethod();
		
		thread1.start();
		thread2.start();
		
		//These are not work as Thread Object. Works as a standart object
//		thread1.run();
//		thread2.run();
	}
	
}
