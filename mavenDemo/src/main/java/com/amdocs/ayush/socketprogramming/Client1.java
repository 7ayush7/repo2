package com.amdocs.ayush.socketprogramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1 {

	public static void main(String[] args) throws UnknownHostException, IOException{
		System.out.println("Client started");
		Socket s = new Socket("localhost", 9099);
		System.out.println("Connection established with server");
		DataInputStream dIn = new DataInputStream(System.in);
		System.out.println("Please enter the message : ");
		String message = dIn.readLine();
		DataOutputStream dOut = new DataOutputStream(s.getOutputStream());
		dOut.writeUTF(message);
		dOut.flush();
		dOut.close();
	}
}
