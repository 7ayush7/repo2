package com.ayush.coding.test;

class N{
	N next;
	int data;
}

class CList{
	N head;
	static int counter=0;
	
	int add(int data){
		N node = new N();
		node.next=null;
		node.data=data;
		
		if(head==null){
			head=node;
			counter++;
			return head.data;
		}
		else{
			N temp = head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=node;
			counter++;
			return temp.next.data;
		}
	}
	
	void remove(int index){
		N temp = head;
		if(index==0){
			head=temp.next;
		}
		for(int i=0;i<index-1;i++){
			temp=temp.next;
		}
		temp.next=temp.next.next;
		counter--;
	}
	public String toString(){
		String ret="";
		N temp = head;
		while(temp.next!=null){
			ret=ret.concat(" ").concat(String.valueOf(temp.data));
			temp=temp.next;
		}
		ret=ret.concat(" ").concat(String.valueOf(temp.data));
		return ret;
	}
}
public class CustomLinkedList2 {

	public static void main(String[] args){
		CList list = new CList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list.toString());
		list.remove(0);
		list.remove(1);
		System.out.println(list.toString());
		System.out.println(list.counter);
	}
}
