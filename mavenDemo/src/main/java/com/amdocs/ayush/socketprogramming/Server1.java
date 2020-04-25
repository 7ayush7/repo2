package com.amdocs.ayush.socketprogramming;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {

	public static void main(String[] args) throws IOException{
		System.out.println("Server started");
		ServerSocket ss = new ServerSocket(9099);
		Socket s = ss.accept();
		System.out.println("Connection established with client");
		DataInputStream dIn = new DataInputStream(s.getInputStream());
		String message = dIn.readUTF();
		System.out.println("Message from client is : "+message);
	}
}
