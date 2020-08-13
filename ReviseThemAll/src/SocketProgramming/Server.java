package SocketProgramming;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException{
		ServerSocket ss = new ServerSocket(7777);
		Socket s = ss.accept();
		DataInputStream dI = new DataInputStream(s.getInputStream());
		System.out.println(dI.readUTF());
		dI.close();
		s.close();
		ss.close();
	}
}
