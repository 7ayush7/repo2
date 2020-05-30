package RevisionOfPrograms;

import java.util.Arrays;

//Pallindrome String : "AyyA","Nitin"
public class Program22 {

	public static void main(String[] args) {
		String s="Nitin";
		s=s.toLowerCase();
		char[] ch=s.toCharArray();
		char[] ch2=new char[ch.length];
		for(int i=0;i<ch.length;i++) {
			ch2[i]=ch[ch.length-i-1];
		}
		if(Arrays.equals(ch, ch2)) {
			System.out.println("Is Pallindrome");
		}
		else {
			System.out.println("Not Pallindrome");
		}
	}
}
