package com.bilgeadam.boost.lesson031;

public class ThreadPriorityExample extends Thread {

	public static void main(String[] args) {	
		
		ThreadPriorityExample t1 = new ThreadPriorityExample();
		ThreadPriorityExample t2 = new ThreadPriorityExample();
		ThreadPriorityExample t3 = new ThreadPriorityExample();
		
		System.out.println(t1.getPriority());;
		System.out.println(t2.getPriority());;
		System.out.println(t3.getPriority());;

		t1.setPriority(6);
		t2.setPriority(MIN_PRIORITY);
		t3.setPriority(10);

		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		
	}

	@Override
	public void run() {
			
		System.out.println("Current Thread: " + Thread.currentThread().getName());
		
	}

}
