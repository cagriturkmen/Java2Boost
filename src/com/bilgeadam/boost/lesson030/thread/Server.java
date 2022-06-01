package com.bilgeadam.boost.lesson030.thread;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(3333);
		
		while(true) {
			
			Socket s = ss.accept();
			System.out.println("A new client is connected: "+ s);
			
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			
			System.out.println("Assigining new thread fo this client");
			//create a new thread object
			Thread t = new ClientHandler(din, dout, s);
			//Invoking the start() method
			t.start();
			
		}
	}
	
}
