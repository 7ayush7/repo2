package RevisionOfPrograms;

//Fibonnaci Series
public class Program11 {

	public static void main(String args[]) {
		
		int first=0,second=1,sum=0;
		int length=10;
		System.out.println(first);
		System.out.println(second);
		for(int i=0;i<length;i++) {
			sum=first+second;
			first=second;
			second=sum;
			System.out.println(sum);
		}
	}
	
}
