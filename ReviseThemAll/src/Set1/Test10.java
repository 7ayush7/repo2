package Set1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test10 {

	public static void main(String... args){
		Map<Integer,Integer> oldMap = new HashMap<>();
		oldMap.put(1,122);
		oldMap.put(9,9);
		oldMap.put(2,221);
		oldMap.put(7,-2);
		oldMap.put(111,111);
		
//		Map<Integer, Integer> sortedMap = new TreeMap<>(new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				if(o1>o2){
//					return o1;
//				}
//				else{
//					return o2;
//				}
//			}
//		});
//		sortedMap.putAll(oldMap);
//		System.out.println(sortedMap);
//		for(Integer i:oldMap.values()){
//			
//		}
//		for(Integer i:oldMap.keySet()){
//			
//		}
		Map<Integer,Integer> newMap = new HashMap<>();
		for(Map.Entry<Integer,Integer> i:oldMap.entrySet()){
			newMap.put(i.getValue(), i.getKey());
		}

	}
}
