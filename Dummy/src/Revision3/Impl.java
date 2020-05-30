package Revision3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Test{
	public int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
public class Impl {
	public static void main(String[] args){
		List<Test> list = new ArrayList<>();

		for(int i=0;i<10;i++){
			Test t = new Test();//This line
			t.setId(i);
			list.add(t);
		}
		for(Test t2:list){
			System.out.println(t2.getId());
		}
		
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
	}
}
