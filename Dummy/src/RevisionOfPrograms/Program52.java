package RevisionOfPrograms;

//To print fibonnaci series using recursion

public class Program52 {

	static int n1=0,n2=1,n3=0;

	public static void main(String[] args) {
		int maxLength=10;
		System.out.print("0 "+"1 ");
		printFibonnaci(maxLength-2);
	}
	
	static void printFibonnaci(int maxLength) {
		if(maxLength>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3+" ");
			printFibonnaci(maxLength-1);
		}
	}
}
