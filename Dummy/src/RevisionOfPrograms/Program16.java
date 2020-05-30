package RevisionOfPrograms;

import java.util.Arrays;
import java.util.Collections;

//Sort and merge 2 arrays
public class Program16 {

	public static void main(String[] args) {
		
		int array1[] = new int[] {0,2,1};
		int array2[] = new int[] {-9,0,8,-10};
		int arrayMerge[] = new int[array1.length+array2.length];
		for(int i=0;i<array1.length;i++) {
			arrayMerge[i]=array1[i];
		}
		for(int i=0;i<array2.length;i++) {
			arrayMerge[i+array1.length]=array2[i];
		}
		Arrays.sort(arrayMerge);
		for(int i:arrayMerge) {
			System.out.println(i);
		}
	}
}
