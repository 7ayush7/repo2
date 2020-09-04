package com.learning.ayush.socketprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		System.out.println("Server is started");
		ServerSocket ss = new ServerSocket(9099);
		System.out.println("Waiting for clients to connect");
		Socket s = ss.accept();
		System.out.println("Connection established with client");
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String message = br.readLine();
		System.out.println("Message from client is : " + message);

	}
}
