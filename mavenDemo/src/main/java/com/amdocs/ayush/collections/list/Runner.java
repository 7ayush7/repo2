package com.amdocs.ayush.collections.list;

public class Runner {

	public static void main(String[] args) throws Exception{
		CustomLinkedList list = new CustomLinkedList();
		list.insertData(1);
		list.insertData(2);
		list.insertData(3);
		list.insertData(123);
		list.insertAt(2, 99);
		list.insertData(7);
		list.printList();
		System.out.println(list.get(2));
		list.delete(2);
		list.printList();
		System.out.println(list.size());
	}
}
