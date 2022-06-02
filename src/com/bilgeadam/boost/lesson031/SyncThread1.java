package com.bilgeadam.boost.lesson031;

public class SyncThread1 extends Thread{
	
	Table t;
	
	
	public SyncThread1(Table t) {
		this.t = t;
	}



	@Override
	public void run() {
		t.printTable(5);
	}

	
}
