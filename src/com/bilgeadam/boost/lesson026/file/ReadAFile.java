package com.bilgeadam.boost.lesson026.file;

import java.io.FileReader;

public class ReadAFile {

	public static void main(String[] args) {
		
		char[] array = new char[100];
				
		try {
			FileReader input = new FileReader("input.txt");
			
			input.read(array);
			System.out.println("Data in the file: ");
			System.out.println(array);
			
			input.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}
