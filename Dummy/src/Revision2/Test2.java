package Revision2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args){
		List<Integer> list = Arrays.asList(1,1,1,2,3,4);
		list.stream().distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList()).forEach(a->System.out.println(a));
	}
}
