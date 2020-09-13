package java8.ayush.assignment12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 * @author ayush.singh
 * 
 * Assignment :
 * 
1. Use the Java 8 API to read the file and extract IP fields 
2. Find out top 10 IP address which have access the apache server most 
3. Group the IP address with same hit/access count

 * */
public class Main {

	public static void main(String[] args) throws IOException {
		List<String> list = Files.readAllLines(Paths.get("C:\\Users\\ayush.singh\\Documents\\testlog.txt")).
		stream().map(a->a.split("- -")).map(a->a[0]).collect(Collectors.toList());
		System.out.println(list);
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for(String s:list) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}
			else {
				map.put(s, 1);
			}
		}
		System.out.println(map);
		
		Map<Integer, Object> map2 = new LinkedHashMap<Integer,Object>();
		for(Entry<String, Integer> e : map.entrySet()) {
			if(map2.containsKey(e.getValue())) {
				map2.put(e.getValue(), map2.get(e.getValue())+","+e.getKey());
			}
			else {
				map2.put(e.getValue(), e.getKey());
			}
		}
		System.out.println(map2);
	}
}
