package com.learning.ayush.miscellaneous.morecodinginterviewquestions;

public class ReverseAStringUsingRecurrsion {

	public static String rev(String s) {
		if (s.length() <= 1) {
			return s;
		}
		return rev(s.substring(1)) + s.charAt(0);
	}

	public static void main(String[] args) {
		String s = "Ayushman";
		System.out.println(rev(s));
	}
}
