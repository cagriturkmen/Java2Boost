package com.bilgeadam.boost.lesson040;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ReadAFile {

	public static void main(String[] args) {
		
		ArrayList<String> tempList = new ArrayList<>();
		StringTokenizer st;
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\cturk\\BilgeAdamJava2\\BilgeAdamJava2Boost\\src\\com\\bilgeadam\\boost\\lesson040\\input.txt"));
			
			String line;
			
			while((line = br.readLine()) != null) {
				tempList.add(line);
				
				st = new StringTokenizer(line,"!");
				
				while(st.hasMoreTokens()) {
					System.out.println(st.nextToken());;
				}
			}
			br.close();

			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//System.out.println(tempList.get(1));
	}
	
}
