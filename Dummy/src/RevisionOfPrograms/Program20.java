package RevisionOfPrograms;

//Check if a string contains another string
public class Program20 {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="This String contains HellO";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		String[] split=s2.split(" ");
		for(int i=0;i<split.length;i++) {
			if(s1.equalsIgnoreCase(split[i])) {
				System.out.println("It contains String 1");
			}
		}
	}
	
}
