package com.ayush.coding.test;

class Node{
	Node next;
	int data;
}

class LinkedList{
	Node head;
	static int counter=0;
	public void add(int data){
		Node n = new Node();
		n.data=data;
		n.next=null;
		
		if(head==null){
			head=n;
		}
		else{
			Node temp = head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=n;
		}
		counter++;	
	}
	public int get(int index) throws Exception{
		if(index<0 || index>=counter){
			throw new Exception("Index is not valid");
		}
		Node temp = head;
		for(int i=0;i<index;i++){
			temp=temp.next;
		}
		return temp.data;
	}
	public void delete(int index){
		Node temp=head;
		for(int i=0;i<index-1;i++){
			temp=temp.next;
		}
		temp.next=temp.next.next;
		counter--;
	}
	public String toString(){
		StringBuilder s = new StringBuilder();
		Node temp = head;
		while(temp.next!=null){
			s.append(temp.data+" : ");
			temp=temp.next;
		}
		s.append(temp.data);
		return s.toString();
	}
}
public class CustomLinkedList {

	public static void main(String[] args) throws Exception{
		LinkedList l = new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		System.out.println(l.toString());
		System.out.println(l.get(5));
		l.delete(0);
		System.out.println(l.toString());
		
	}
}
