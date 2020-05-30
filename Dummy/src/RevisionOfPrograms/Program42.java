package RevisionOfPrograms;

//Custom Linked List : add, get and Remove functionality
public class Program42 {

	public static void main(String[] args) {
		CustomList list = new CustomList();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.remove(0);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}

class CustomList{
	Node head;
	static int counter;
	
	public void add(Object data) {
		if(head==null) {
			head=new Node(data);
		}
		Node temp=new Node(data);
		Node current=null;
		if(head!=null) {
			current=head;
			while(current.getNext()!=null) {
				current = current.getNext();
			}
			current.setNext(temp);
			counter++;
		}
	}
	
	public Object get(int index) {
		if(index<0) {
			return null;
		}
		Node current=null;
		if(head!=null) {
			current=head.getNext();
			for(int i=0;i<index;i++) {
				if(current.getNext()==null) {
					return null;
				}
				current=current.getNext();
			}
			return current.getData();
		}
		return current;
	}
	
	public boolean remove(int index) {
		if(index<0) {
			return false;
		}
		Node current=null;
		if(head!=null) {
			current=head;
			for(int i=0;i<index;i++) {
				if(current.getNext()==null) {
					return false;
				}
				current = current.getNext();
			}
			current.setNext(current.getNext().getNext());
			counter--;
			return true;
		}
		return false;
	}
	
	public int size() {
		return counter;
	}
}

class Node{
	Node next;
	Object data;
	
	Node(Object data){
		this.next=null;
		this.data=data;
	}
	Node(Node next,Object data){
		this.next=next;
		this.data=data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}