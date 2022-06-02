package com.bilgeadam.boost.lesson031;

public class SyncThread2 extends Thread{
	
	Table t;
	
	
	public SyncThread2(Table t) {
		this.t = t;
	}



	@Override
	public void run() {
		t.printTable(100);
	}

	
}
