package com.learning.ayush.collections.list;

public class CustomLinkedList {
	Node head;
	static int counter = 0;

	public int size() {
		return counter;
	}

	public void insertData(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		counter++;
	}

	public void checkForException(int index) throws Exception {
		if (index >= counter) {
			throw new Exception("Invalid index");
		}
	}

	public int get(int index) throws Exception {

		checkForException(index);

		if (index == 0) {
			return head.data;
		} else {
			Node temp = head;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			return temp.next.data;
		}
	}

	public void insertAtStart(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		newNode.next = head;
		head = newNode;
		counter++;
	}

	public void insertAt(int index, int data) throws Exception {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		checkForException(index);
		if (index == 0) {
			insertAtStart(data);
		} else {
			Node temp = head;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
			counter++;
		}
	}

	public void delete(int index) throws Exception {
		checkForException(index);
		Node temp = head;
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}
		System.out.println("Deleted data is : " + temp.next.data);
		temp.next = temp.next.next;
		counter--;
	}

	public void printList() {
		Node temp = head;
		while (temp.next != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.print(temp.data);
		System.out.println();
	}
}
