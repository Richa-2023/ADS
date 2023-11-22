package linked_list;

public class CircularLinkedList {

	private Node head;
	private Node tail;

	public static class Node {
		private int data;
		private Node next;
		private Node prev;

		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;

		}
	}

	public void append(int data) {
		Node newNode = new Node(data);

		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		}

		else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			tail.next = head;
		}
	}

	public void addAtStart(int data) {
		Node newNode = new Node(data);

		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		}

		else {
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
			tail.next = head;
		}
	}
	
	
	public void insertAtPosition(int element,int value)
	{
		// if  position == 0
		
		
		// if position is at tail// last//
		
		
		// if position is random//
		
		Node currentNode=head;
		
		while(currentNode.data != element)
		{
			currentNode=currentNode.next;
		}
		Node newNode= new Node(value);
		newNode.next=currentNode.next;
		currentNode.next.prev=newNode;
		currentNode.next=newNode;
		newNode.prev=currentNode;
		
	}

	private boolean isEmpty() {
		return (head == null) ? true : false;
	}

	public void deleteFirst() {
		if (head == null) {
			System.out.println(" u cant delete it");
		}

		head.next.prev=tail;
		tail.next=head.next;
		head=head.next;
		

	}

	public void deleteLast() {
		if (tail == null) {
			System.out.println(" nooooo");
			
			
		}
        tail.prev.next=head;
        head.prev=tail.prev;
        tail=tail.prev;

		
	}
	
	
	public void deleteAtPosition(int element)
	{
		Node currentNode=head;
		while(currentNode.data!= element)
		{
			currentNode=currentNode.next;
		}
		
		currentNode.prev.next=currentNode.next;
		currentNode.next.prev=currentNode.prev;
	}
	
	

	public void display() {
		Node currentNode = head;

//		while (currentNode != null) {
//			System.out.print(currentNode.data + " ");
//			currentNode = currentNode.next;
//
//		}
//		System.out.println();

		do 
		{
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		} while (currentNode != head);

	}

	public static void main(String[] args) {
		CircularLinkedList newList = new CircularLinkedList();
		newList.append(19);
		newList.append(8);
		newList.append(11);
		newList.append(29);
		newList.append(99);
		newList.display();
		System.out.println("\n-----------------------------");
		newList.insertAtPosition(8, 5);
		newList.deleteAtPosition(29);
		newList.deleteLast();
		newList.display();

	}

}