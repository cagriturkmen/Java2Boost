package com.bilgeadam.boost.lesson026.file;

import java.io.File;
import java.io.IOException;

public class CreateAFile {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\cturk\\BilgeAdamJava2\\BilgeAdamJava2Boost\\src\\com\\bilgeadam\\boost\\lesson026\\newFile.txt");
		
		try {
		boolean value =	file.createNewFile();
		
		if(value) {
			System.out.println("The new file is created.");
		}else {
			System.out.println("The file already exists.");
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
