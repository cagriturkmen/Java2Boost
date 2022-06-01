package com.bilgeadam.boost.lesson030.thread;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Scanner scan = new Scanner(System.in);
		
		Socket s = new Socket("localhost",3333);
		
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		
		while(true) {
			
			System.out.println(din.readUTF());
			String line = scan.nextLine();
			dout.writeUTF(line);
			
			if(line.equals("Exit")) {
				System.out.println("Closing this connection: "+ s);
				s.close();
				break;
			}
			
			String received = din.readUTF();
			System.out.println(received);
			
		}
		scan.close();
		din.close();
		dout.close();
	}
}
