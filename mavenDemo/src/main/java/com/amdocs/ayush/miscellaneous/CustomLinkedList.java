package com.amdocs.ayush.miscellaneous;

class Node<T>{
	Node next;
	T value;
}
class LinkedListA<T>{
	Node head;
	int count=0;
	
	public void add(T value){
		Node n = new Node();
		n.next=null;
		n.value=value;
		
		if(head==null){
			head = n;
		}
		else{
		Node temp = head;
		while(temp.next!=null){
			temp = temp.next;
		}
		temp.next=n;
		}
		count++;
	}
	public void printList(){
		Node temp = head;
		while(temp.next!=null){
			System.out.println(temp.value);
			temp=temp.next;
		}
		System.out.println(temp.value);
	}
}
public class CustomLinkedList {

	public static void main(String[] args){
		LinkedListA<Integer> list = new LinkedListA();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list.count);
		System.out.println();
		list.printList();
		System.out.println();
	}
}
