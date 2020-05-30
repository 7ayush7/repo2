package RevisionOfPrograms;

import java.util.Arrays;
import java.util.List;

// count occurrence of elements in an array/list of Integer
public class Program1 {
	
	public static void main(String[] args) {
		
		Integer[] intArray = new Integer[]{1,2,3,4,4,5,5,5,5,6};
		List<Integer> intList = Arrays.asList(intArray);
		int[] countArray = new int[intArray.length];
		for(int i=0;i<intArray.length;i++) {
			int count=1;
			for(int j=i+1;j<intArray.length;j++) {
				if(intArray[i]==intArray[j]) {
					count++;
					countArray[j]=-1;
				}
			}	
			if(countArray[i]!=-1) {
				countArray[i]=count;
			}
		}
		
		for(int i=0;i<intArray.length;i++) {
			if(countArray[i]>=1) {
				System.out.println(countArray[i]+" --- "+intArray[i]);
			}
		}
		
	}
	
}

