package SocketProgramming;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	/**
	 * @param args
	 * @throws UnknownHostException
	 * @throws IOException
	 */
	public static void main(String[] args) throws UnknownHostException, IOException{
		
		Socket s = new Socket("localhost", 7777);
		DataOutputStream dOut = new DataOutputStream(s.getOutputStream());
		dOut.writeUTF("Hello Ayush this side.");
		dOut.flush();
		dOut.close();
		s.close();
		
	}
}
