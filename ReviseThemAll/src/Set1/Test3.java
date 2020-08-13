package Set1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test3 {

	public static void main(String[] args){
		
		Parent p = new Parent();
		List<Integer> list = p.getList();
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()){
			if(itr.next()==7){
			list.set(itr.next(), 123);
			}
		}
		for(Integer i:p.getList()){
			System.out.println(i);
		}
		System.out.println();
		for(Integer i:list){
			System.out.println(i);
		}
	}
	
}

final class Parent{
	private final List<Integer> list = new LinkedList<>();
	private final int id;
	Parent(){
		for(int i=0;i<10;i++){
			this.list.add(i);
		}
		id=10;
	}
	public final List<Integer> getList() {
		//To Handle the List, while using it an immutable class always clone the list and return the clone and not the original list
		//return new ArrayList<>(list);

		return list;
	}
	public int getId() {
		return id;
	}
}