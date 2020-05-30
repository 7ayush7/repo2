package RevisionOfPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// To find min and max occurring element in a list
public class Program54 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("a","a","a","a","a","a","a","B","c","c","c","e","e","e","f","f");
		HashMap<String,Integer> hm = new HashMap<>();
		
		for(int i=0;i<list.size();i++) {
			if(hm.containsKey(list.get(i))) {
				if(list.get(i).equalsIgnoreCase("a")||list.get(i).equalsIgnoreCase("e")||list.get(i).equalsIgnoreCase("i")
						||list.get(i).equalsIgnoreCase("o")||list.get(i).equalsIgnoreCase("u")) {
				int count = hm.get(list.get(i));
				count++;
				hm.put(list.get(i), count);
				}
			}
			else {
				hm.put(list.get(i), 1);
			}
		}
		System.out.println(hm);
		
		int min=1,max=0;
		String valueMin=null,valueMax=null;
		for(String i:hm.keySet()) {
			if(min>=hm.get(i)) {
				min=hm.get(i);
				valueMin=i;
			}
			if(max<=hm.get(i)) {
				max=hm.get(i);
				valueMax=i;
			}
		}
		System.out.println(min+" "+valueMin);
		System.out.println(max+" "+valueMax);

		for(String i:hm.keySet()) {
			if(hm.get(i)>1) {
			System.out.println(i+" "+hm.get(i));
			}
		}
	}
}
