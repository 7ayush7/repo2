package Set1;

import java.util.ArrayList;
import java.util.List;

public class Test11 {
	
	Test11(){
		System.out.println("The Parent Constructor");
	}

	public static void main(String... args) {
		List<Object> list = new ArrayList();
		list.add(1);
		List<Object> object = new ArrayList();
		List<Object> object3 = new ArrayList();
		List<Object> object4 = new ArrayList();
		List<Object> object5 = new ArrayList();
		object.add(1);
		object.add(2);
		object3.add(45);
		object4.add(122);
		object4.add(2112);
		object5.add(1222);
		object5.add(object3);
		object4.add(object3);
		object.add(object3);
		object.add(object4);
		object.add(object5);
		object.add(3);
		list.add(object);
		System.out.println(list);

		List<Object> finalList = new ArrayList<>();
		for (Object a : list) {
			breakThatFuckingArrayIntoPieces(a, finalList);
		}
		System.out.println(finalList);
	}

	static void breakThatFuckingArrayIntoPieces(Object thatDamnArray, List<Object> finalList) {
		if (thatDamnArray instanceof List<?>) {
			List<Object> dummy = (List<Object>) thatDamnArray;
			for (int i = 0; i < dummy.size(); i++) {
				breakThatFuckingArrayIntoPieces(dummy.get(i), finalList);
			}
		} else {
			finalList.add(thatDamnArray);
		}
	}
}
