package com.amdocs.ayush.socketprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException{
		System.out.println("Client server started");
		Socket s = new Socket("localhost", 9099);
		System.out.println("Connection established with server");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter your message to the server");
		String message = br.readLine();
		PrintWriter p = new PrintWriter(s.getOutputStream(), true);
		p.println(message);
		
	}
}
