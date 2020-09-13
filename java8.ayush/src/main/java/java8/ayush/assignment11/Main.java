package java8.ayush.assignment11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author ayush.singh
 * 
 * Java Nio API's
	1) Pick any PDF files of size more than 10 KB
	2) Read the file using java nio API
	3) split the file in chunks of 5KB
	4) Read splitted chunks and write the file
	5) New file which is created at step 4, should be of same size and should be able to read using acrobat reader 

 * 
 * */
public class Main {

	public static void main(String[] args) throws IOException {
		Files.createDirectories(Paths.get("test"));
		Path u = Paths.get("test/1.txt");
		Path p = Files.createFile(u);
		StringBuilder s = new StringBuilder();
		for(int i=0;i<1000;i++) {
			s.append("This is Ayush");
			s.append(" ");
		}
			Files.write(p, s.toString().getBytes());
			System.out.println(Files.size(Paths.get("test//1.txt")));
	}
}
