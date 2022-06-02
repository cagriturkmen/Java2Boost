package com.bilgeadam.boost.lesson031;

public class JoinMethod2 extends Thread{

	@Override
	public void run() {
		
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
	
		JoinMethod2 t1 = new JoinMethod2();
		
		JoinMethod2 t2 = new JoinMethod2();
		
		JoinMethod2 t3 = new JoinMethod2();
		
		t1.start();
		try {
			t1.join(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
	
		t3.start();
		
	}
		
	
}
