package RevisionOfPrograms;

//Reverse a String
public class Program24 {

	public static void main(String[] args) {
		
		String s="Hello this String is going to get reversed in a second";
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			ch[i]=s.charAt(s.length()-i-1);
		}
		System.out.println("Reversed String is : "+String.valueOf(ch));
	}
}
