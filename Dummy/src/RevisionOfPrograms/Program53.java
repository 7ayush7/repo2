package RevisionOfPrograms;

import java.util.ArrayList;
import java.util.List;

// To print prime numbers less than 100
public class Program53 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();

		for(int i=2;i<=100;i++) {
			boolean isPrime=true;
			for(int j=2;j<=i;j++) {
				if(i%j==0 && i!=j) {
					isPrime=false;
				}
			}
			if(isPrime) {
				list.add(i);
			}

		}
		System.out.println(list);
		System.out.println(list.size());
		
	}
}
