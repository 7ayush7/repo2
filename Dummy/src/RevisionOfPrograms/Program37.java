package RevisionOfPrograms;

//Pattern Printing (Star)
public class Program37 {

	public static void main(String[] args) {
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==j || i<j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
