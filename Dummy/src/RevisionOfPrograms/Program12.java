package RevisionOfPrograms;

//Prime number
public class Program12 {

	public static void main(String[] args) {
		int num=2;
		boolean isPrime=true;
		if(num==1) {
			isPrime=false;
		}
		for(int i=2;i<=num;i++) {
			if(num%i==0 && i!=num) {
				isPrime=false;
			}
		}
		System.out.println(isPrime?"Is Prime":"Not Prime");
	}
	
}
