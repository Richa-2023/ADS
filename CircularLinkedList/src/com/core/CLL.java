package com.core;

public class CLL {
	private Node head;
	private Node tail;

	public CLL() {
		super();
		this.head = null;
		this.tail = null;
	}

	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}

	}

	public void display() {
		Node trav = head;
		while (trav != tail) {
			System.out.print(trav.data + "->");
			trav = trav.next;
		}
		System.out.print(tail.data + "->");
	}

	public void addAtFirst(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			node.next = head;
			head = node;

		}
	}

	public void addAtLast(int data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.next = head;
			tail = newNode;
		}
	}

	public void addAtMid(int data, int pos) {

		Node newNode = new Node(data);
		Node trav = head;
		if (head == null) {
			head = newNode;
		}
		for (int i = 0; i < pos; i++)
			trav = trav.next;
		newNode.next = trav.next;
		trav.next = newNode;
	}

	public int delAtFirst() {
		if (head == null)
			throw new RuntimeException("linkedList is Empty");
		else {
			int element = head.data;
			head = head.next;
			return element;
		}
	}

	public int delAtLast() {

//		Node prev=null;
//		if (head == null)
//			throw new RuntimeException("linkedList is Empty");
//		else {
//			Node trav = head;
//			while (trav.next != null) {
//				prev=trav; 
//				trav = trav.next;	
//			}
//			int element = trav.data;
//			prev.next=null;
//			return element;
//		}

		if (head == null) {
			return -1;
		}
		Node trav = head;
		while (trav.next != tail) {
			trav = trav.next;
		}
		int data = tail.data;
		tail = trav;
		tail.next = head;
		return data;

	}

	public void delAll() {
		head = null;
	}

}
