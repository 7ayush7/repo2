package RevisionOfPrograms;

import java.util.Arrays;

//Anagram String : a string contains same set of characters in different order
public class Program21 {

	public static void main(String[] args) {
	String s1="Hello Usera This is a string";
	String s2="Hello Stringa this is a user";
	 s1=s1.toLowerCase();
	 s2=s2.toLowerCase();
	 
	 char[] s1Char=s1.toCharArray();
	 char[] s2Char=s2.toCharArray();
	 
	 Arrays.sort(s1Char);
	 Arrays.sort(s2Char);

	 if(Arrays.equals(s1Char, s2Char)) {
		 System.out.println("Anagram String");
	 }
	 else {
		 System.out.println("Not Anagram");
	 }
	}
}
