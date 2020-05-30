package RevisionOfPrograms;

import java.util.HashMap;
import java.util.List;

//Cloning a object using clonable
 class Student implements Cloneable{
	int id;

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Program48{
	public static void main(String[] args) throws CloneNotSupportedException {
		Student st = new Student();
		Student st2=(Student) st.clone();
		System.out.println(st2);
		
		//Creating a generic map
		HashMap hm2 = new HashMap<>();
		hm2.put(1, "A");
		hm2.put(1.0, "B");
		System.out.println(hm2);
		
		HashMap<Integer,Integer> hm3 = new HashMap<>();
		hm3.put(-1, -1);
		hm3.put((int) -1.0, -2);

		System.out.println(hm3);
		
	}
}