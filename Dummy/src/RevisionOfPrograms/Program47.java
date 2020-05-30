package RevisionOfPrograms;

//String containing characters and brackets, find if brackets are paired
public class Program47 {

	public static void main(String[] args) {
		String s="asasasasa[]adsasasas[asasasasas[saasas]asasa[sa[]";
		s=s.toLowerCase();
		char[] c=s.toCharArray();
		String[] split =s.split("\\[]");
		System.out.println(split.length);
	}
}
