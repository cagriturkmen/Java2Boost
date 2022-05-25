package com.bilgeadam.boost.lesson026.iostream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream file = new FileInputStream("input.txt");

			BufferedInputStream input = new BufferedInputStream(file);
			
			int i = input.read();
			
			while(i != -1) {
				System.out.print((char)i);
				
				i = input.read();
			}
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
}
		
	}

}
