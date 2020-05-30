package RevisionOfPrograms;

import java.util.ArrayList;
import java.util.List;

//Program to add 1 to 7 in a list using recursion function
public class Program51 {

	static List<Integer> list = new ArrayList<>();
	static int count=1;

	public static void main(String[] args) {	
		addNum();		
		System.out.println(list);	
	}
	
	static void addNum() {
		if(count<=7) {
			list.add(count);
			count++;
			addNum();
		}
	}
}
