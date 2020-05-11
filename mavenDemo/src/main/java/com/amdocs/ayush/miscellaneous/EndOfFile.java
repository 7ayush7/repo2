package com.amdocs.ayush.miscellaneous;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EndOfFile {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(new File("ReadFile.txt"));
		StringBuilder build = new StringBuilder();
		int lineNumber = 0;
		while(sc.hasNext()){
			build.append(lineNumber+" ");
			build.append(sc.nextLine());
			build.append(System.lineSeparator());
			lineNumber++;
		}
		System.out.println(build.toString());
	}
}
