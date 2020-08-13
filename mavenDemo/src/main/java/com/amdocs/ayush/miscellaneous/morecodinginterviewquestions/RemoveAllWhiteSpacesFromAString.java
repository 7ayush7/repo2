package com.amdocs.ayush.miscellaneous.morecodinginterviewquestions;

import java.util.Scanner;

public class RemoveAllWhiteSpacesFromAString {

	public static void main(String[] args){
		String in = new Scanner(System.in).nextLine();
		in = in.replaceAll(" ", "");
		System.out.println(in);
	}
}
