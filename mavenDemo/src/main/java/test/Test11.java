package test;

/**
 * Task :
 * 
 * Reverse a given String
 * 
 * */
public class Test11 {
	
	public static void main(String[] args){
		String s = "Hello";
		char[] c1 = s.toCharArray();
		char[] c2 = new char[c1.length];
		
		for(int i=0;i<c1.length;i++){
			c2[c1.length-i-1]=c1[i];
		}
		System.out.println(String.valueOf(c2));
	}
}
