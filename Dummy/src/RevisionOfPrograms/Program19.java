package RevisionOfPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//to find count of vowels from a string
public class Program19 {

	public static void main(String[] args) {
		String s="a random string that can contain any number of vowels that i am not aware of";
		char[] vowels=new char[] {'a','e','i','o','u'};
		s=s.toLowerCase();
		int counter=0;
		Map<String,Integer> m=new HashMap<>();
		char[] sChar=s.toCharArray();
		for(int i=0;i<sChar.length;i++) {
			for(int j=0;j<vowels.length;j++) {
				if(sChar[i]==vowels[j]) {
					counter++;
					if(m.containsKey(String.valueOf(sChar[i]))) {
						int count=m.get(String.valueOf(sChar[i]));
						count++;
						m.put(String.valueOf(sChar[i]), count);
					}
					else {
						m.put(String.valueOf(sChar[i]), 1);
					}
				}
			}
		}
		System.out.println("Total appearence of vowles :"+counter);		
		System.out.println(m);
	}
}
