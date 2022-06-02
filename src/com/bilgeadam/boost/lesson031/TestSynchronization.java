package com.bilgeadam.boost.lesson031;

public class TestSynchronization {
	public static void main(String[] args) {
	Table obj = new Table();
	
	SyncThread1 t1 = new SyncThread1(obj);
	SyncThread2 t2 = new SyncThread2(obj);
	t1.start();
	t2.start();
}
}
