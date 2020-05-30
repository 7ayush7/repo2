package RevisionOfPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Min and Max occurring characters in a string
public class Program23 {

	public static void main(String[] args) {
		
		String s="sasaaaaswswaasasaaaawsaaeeerrriioowwwwqquuquququ";
		s=s.toLowerCase();
		char[] chArray=s.toCharArray();
		int[] intArray=new int[chArray.length];
		for(int i=0;i<chArray.length;i++) {
			int count=1;
			for(int j=i+1;j<chArray.length;j++) {
				if(chArray[i]==chArray[j]) {
					if(chArray[i]=='a' ||chArray[i]=='e'||chArray[i]=='i'||chArray[i]=='o'||chArray[i]=='u') {
					count++;
					intArray[j]=-1;
					}
				}
			}
			if(intArray[i]>-1) {
				intArray[i]=count;
			}
		}
		
		for(int i=0;i<chArray.length;i++) {
			if(intArray[i]>1) {
				System.out.println(chArray[i]+" ----- "+intArray[i]);
			}
		}
	}
}
