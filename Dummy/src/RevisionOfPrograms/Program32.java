package RevisionOfPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Convert Keys and Values of Maps to List
public class Program32 {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		map.put("A", "AA");
		map.put("B", "AA");
		map.put("C", "AA");
		map.put("D", "AA");
		map.put("E", "AA");
		
	
		List<String> keyList = new ArrayList<>();
		List<String> valuesList = new ArrayList<>();
		
		valuesList.addAll(map.values());

		keyList.addAll(map.keySet());
	//	valuesList.addAll(map.values());
		System.out.print(keyList);
		System.out.println();
		System.out.print(valuesList);
	}
}
