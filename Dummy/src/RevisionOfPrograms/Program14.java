package RevisionOfPrograms;

//Pallindrome number
public class Program14 {

	public static void main(String[] args) {
		
		int num=121,temp=num;
		int sum=0,rem=0;
		while(num>0) {
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(sum==temp) {
			System.out.println("Pallindrome number");
		}else {
			System.out.println("Not Pallindrome number");
		}
	}
	
}
