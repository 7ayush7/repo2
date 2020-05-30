package RevisionOfPrograms;

import java.util.HashMap;
import java.util.Map;

//To calculate frequency of elements in an array : also Max and Min 
public class Program36 {

	public static void main(String[] args) {
		int[] a = new int[] {1,1,2,4,5,34,2,3,4,4,55,3,5};
		int length = a.length;
		Map<Integer,Integer> hm=new HashMap<>();
		
		for(int i=0;i<length;i++) {
			int key=a[i];
			if(hm.containsKey(key)) {
				int count = hm.get(key);
				count++;
				hm.put(key, count);
			}
			else {
				hm.put(key, 1);
			}
		}
		int min=1,max=1;
		int valueMin = 0,valueMax=0;
		for(int i:hm.keySet()) {
			if(min>=hm.get(i)) {
				min=hm.get(i);
				valueMin=i;
			}
			if(max<hm.get(i)) {
				max=hm.get(i);
				valueMax=i;
			}
		}
		System.out.println(min+" Min "+valueMin);
		System.out.println(max+" Min "+valueMax);

	}
}
