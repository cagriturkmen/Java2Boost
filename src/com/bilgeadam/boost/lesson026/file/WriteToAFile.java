package com.bilgeadam.boost.lesson026.file;

import java.io.FileWriter;

public class WriteToAFile {

	public static void main(String[] args) {
		
		String data = "This is the data in the output file v2";
		
		try {
			//Create a Writer using FileWriter
			FileWriter output = new FileWriter("output.txt");
			//Writes string to the file
			output.write(data);
			
			System.out.println("Data is written to the file.");
			
			//Closes the writer
			output.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
