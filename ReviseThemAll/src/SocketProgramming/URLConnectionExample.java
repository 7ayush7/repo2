package SocketProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionExample {

	public static void main(String... args) throws IOException{
		URL url = new URL("http://www.javatpoint.com/java-tutorial");
		URLConnection conn = url.openConnection();
		conn.getInputStream();
		BufferedReader bi = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		while(bi.read()!=-1){
			System.out.println(bi.readLine());
		}
	}
}
