package linked_list;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    
    
	public static class Node
	{
		private int data;
		private Node next;
		private Node prev;
	
		
	public Node(int data)
	{
		this.data=data;
		this.next=null;
		this.prev=null;
		
	}
	
	
	}
	
	public boolean isEmpty()
	{
		return (head==null);
		
	}
	
	public void append(int data)
	{
		Node newNode = new Node(data);
		
		if(isEmpty())
		{
			head=newNode;
			tail=newNode;
		}
		
		else
		{
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;
		}
	}
	
	public void deleteFirst()
	{
		if(head== null)
		   {
			   System.out.println(" u cant delete it");
		   }
		
		head=head.next;
	
	}
	
	public void deleteLast()
	{
		if(tail==null)
		{
			System.out.println(" nooooo");
		}
		
		else
		{
			tail=tail.prev;
			tail.next=null;
		}
	}
	
	public void display()
	{
		Node currentNode=head;
		
		while(currentNode != null)
		{
			System.out.print(currentNode.data+ " ");
			currentNode=currentNode.next;
			
		}
		System.out.println();
	}


public static void main(String [] args)
{
	DoublyLinkedList newList=new DoublyLinkedList();
	newList.append(19);
	newList.append(8);
	newList.append(11);
	newList.append(29);
	newList.append(99);
	newList.display();
	newList.deleteFirst();
	newList.deleteLast();
	newList.display();

}
}
