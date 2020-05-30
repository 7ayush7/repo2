package RevisionOfPrograms;

//Armstrong number
public class Program13 {

	public static void main(String[] args) {
		
		int num=153,temp=num;
		int sum=0,rem=0;
		
		while(num>0) {
			
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
			
		}
		if(temp==sum) {
			System.out.println("Is Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
	}
	
}
