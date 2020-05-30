package RevisionOfPrograms;

import java.util.HashMap;
import java.util.Map;

//to extract min and max occurring characters in a string
public class Program45 {
	
	public static void main(String[] args) {
		String dummy = "asasassdewaiurlkjdsajsadkjahdlewlADa";
		dummy=dummy.toLowerCase();
		char[] chArray=dummy.toCharArray();
		int length = chArray.length;
		
		Map<String,Integer> map=new HashMap<>();
		for(int i=0;i<length;i++) {
			String key=String.valueOf(chArray[i]);
			if(map.containsKey(key)) {
				int value=map.get(key);
				value++;
				map.put(key, value);
			}
			else {
				map.put(key, 1);
			}
		}
		System.out.println(map);
	}
}
