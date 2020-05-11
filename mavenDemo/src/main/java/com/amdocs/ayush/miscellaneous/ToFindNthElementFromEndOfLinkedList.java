package com.amdocs.ayush.miscellaneous;

class NodeAB<T>{
	NodeAB next;
	T value;
}
class LinkedListAB<T>{
	NodeAB head;
	int count=0;
	
	public void add(T value){
		NodeAB n = new NodeAB();
		n.next=null;
		n.value=value;
		
		if(head==null){
			head = n;
		}
		else{
		NodeAB temp = head;
		while(temp.next!=null){
			temp = temp.next;
		}
		temp.next=n;
		}
		count++;
	}
	
	public T getNthElementFromEnd(int n){
		int index = this.count-n;
		NodeAB temp = head;
		for(int i=0;i<index;i++){
			temp=temp.next;
		}
		return (T) temp.value;
	}
	public void printList(){
		NodeAB temp = head;
		while(temp.next!=null){
			System.out.println(temp.value);
			temp=temp.next;
		}
		System.out.println(temp.value);
	}
}

public class ToFindNthElementFromEndOfLinkedList {
	public static void main(String[] args){
		LinkedListAB<Integer> list = new LinkedListAB();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list.count);
		System.out.println();
		list.printList();
		System.out.println();
		System.out.println(list.getNthElementFromEnd(2));	
		}
}
