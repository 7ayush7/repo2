package RevisionOfPrograms;

import java.util.Arrays;
import java.util.List;

//To find duplicates in a list : using both long and short way
public class Program8 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,1,1,1,1,2);
		//List<Integer> list
		int[] dupArray=new int[list.size()];
		for(int i=0;i<list.size();i++) {
			int count=1;
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i)==list.get(j)) {
					count++;
					dupArray[j]=-1;
				}
			}
			if(dupArray[i]!=-1) {
				dupArray[i]=count;
			}
		}
		
		for(int i=0;i<list.size();i++) {
			if(dupArray[i]>1) {
				System.out.println(list.get(i)+" "+dupArray[i]);
			}
		}
		
	}
	
}
