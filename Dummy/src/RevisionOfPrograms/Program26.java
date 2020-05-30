package RevisionOfPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//Use of List Iterators
public class Program26 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			String element = (String) itr.next();
			if (element.equals("1")) {
				itr.remove();

			}
		}
		System.out.println(list);
	}
}
