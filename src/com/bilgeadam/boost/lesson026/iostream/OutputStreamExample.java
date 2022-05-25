package com.bilgeadam.boost.lesson026.iostream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamExample {

	public static void main(String[] args) {
		
		
		String data = "This is a line of text inside the file.";
		
		
		try {
			OutputStream out = new FileOutputStream("output.txt");
			
			//Converts the string into bytes
			byte[] dataBytes = data.getBytes();
			out.write(dataBytes);
			System.out.println("Data is written to the file.");
			
			out.flush();
			out.close();
			
		} catch (Exception e) {
			e.getStackTrace();
		}
		
	}

}
