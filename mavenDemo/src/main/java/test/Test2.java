package test;

import java.util.HashMap;
import java.util.Map;

public class Test2 {

	public static void main(String[] arfs){
		String s = "ayush kumar singh";
		char c[] = s.toCharArray();
		char ch[] = {'a','e','i','o','u'};
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<c.length;i++){
			for(int j=0;j<ch.length;j++){
				if(c[i]==ch[j]){
					if(map.containsKey(ch[j])){
						map.put(ch[j], map.get(ch[j])+1);
					}
					else{
						map.put(ch[j], 1);
					}
				}
			}
		}
		System.out.println(map);
	}
}
