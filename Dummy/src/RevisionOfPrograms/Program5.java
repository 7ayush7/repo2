package RevisionOfPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Creating Singleton List
public class Program5 {

	public static void main(String[] args) {
		List<Integer> list=Collections.singletonList(4);
		Map<String,String> map=Collections.singletonMap("A", "A");
		Set<String> set=Collections.singleton("A");
		
		System.out.println(list);
		System.out.println(map);
		System.out.println(set);

	}
	
}
