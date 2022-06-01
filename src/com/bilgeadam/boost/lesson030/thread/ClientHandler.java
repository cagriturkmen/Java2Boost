package com.bilgeadam.boost.lesson030.thread;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClientHandler extends Thread{
	
	DateFormat fordate = new SimpleDateFormat("yyyy/MM/dd");
	DateFormat fortime = new SimpleDateFormat("hh:mm:ss");
	
	DataInputStream din;
	DataOutputStream dout;
	Socket s;
	
	public ClientHandler(DataInputStream din, DataOutputStream dout, Socket s) {
		this.din = din;
		this.dout = dout;
		this.s = s;
	}

	@Override
	public void run() {
		
		String received;
		String returnValue;
		while(true) {
		try {
			dout.writeUTF("What you wann do? Date or Time\n Type Exit to exit");
			received =din.readUTF();
			
			if(received.equals("Exit")) {
				this.s.close();
				System.out.println("Connection closed");
				break;
			}
			
			Date date = new Date();
			
			switch (received) {
			case "Date":
				returnValue = fordate.format(date);
				dout.writeUTF(returnValue);
				break;
			case "Time":
				returnValue = fortime.format(date);
				dout.writeUTF(returnValue);
				break;

			default:
				dout.writeUTF("Invalid value");
				break;
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		try {
			this.din.close();
			this.dout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
