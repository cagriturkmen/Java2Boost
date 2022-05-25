package com.bilgeadam.boost.lesson026.file;

import java.io.File;

public class DeleteAFile {

	public static void main(String[] args) {
		
		File file = new File("newFile.txt");
		
		boolean value = file.delete();
		
		if(value) {
			System.out.println("The file is deleted");
		}else {
			System.out.println("The file is not deleted.");
		}
		
	}

}
