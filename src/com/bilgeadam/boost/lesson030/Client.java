package com.bilgeadam.boost.lesson030;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	private Socket socket;
	private DataInputStream input;
	private DataOutputStream output;
	
	
	public Client(String address, int port) {
		
		
		try {
			//establish a connection
			socket = new Socket(address,port);
			System.out.println("Connected");
			
			//takes input from terminal
			input = new DataInputStream(System.in);
			
			//sends output to the socket
			output = new DataOutputStream(socket.getOutputStream());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//string to read message from input
		String line = "";
		
		while(!line.equals("Exit")) {
			try {
				line = input.readLine();
				output.writeUTF(line);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//close the connection
		try {
			input.close();
			output.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		Client client = new Client("127.0.0.1", 5000);
	}
	

}
