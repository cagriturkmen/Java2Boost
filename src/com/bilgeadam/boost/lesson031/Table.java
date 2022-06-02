package com.bilgeadam.boost.lesson031;

public class Table {
	
	synchronized static void printTable(int n) {
		
			for (int i = 1; i < 5; i++) {
				
				System.out.println(n*i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		
		
	}
	
	
	
}
