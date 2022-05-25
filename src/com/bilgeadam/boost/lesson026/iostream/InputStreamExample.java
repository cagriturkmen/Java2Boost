package com.bilgeadam.boost.lesson026.iostream;

import java.io.FileInputStream;
import java.io.InputStream;

/*
 -FileInputStream
 -ByteArrayInputStream
 -ObjectInputStream
 * */

public class InputStreamExample {

	public static void main(String[] args) {
		byte[] array2 = new byte[40];
		try {
			InputStream input = new FileInputStream("input.txt");
			
			//System.out.println("Available bytes in the file: "+input.available());
			byte[] array = new byte[input.available()];

			//input.skip(5);
			System.out.println("Input stream after skipping 5 bytes: ");
			
			input.read(array);
			System.out.println("Data read from the file: ");
			//Convert byte array into String
			String data = new String(array);
			System.out.println(data);
			
			input.close();

		} catch (Exception e) {
		e.getStackTrace();
		}
		
	}

}
