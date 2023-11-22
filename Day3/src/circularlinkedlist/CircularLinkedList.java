package circularlinkedlist;


public class CircularLinkedList {


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
				tail.next=head;
				head.prev=tail;
			}
			
			
			else
			{
				
				newNode.next=head;
				tail.next=newNode;
				newNode.prev=tail;
				head.prev=newNode;
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
			
			do
			{
				System.out.print(currentNode.data+ " ");
				currentNode=currentNode.next;
				
			}while(currentNode != head);
			System.out.println();
		}


	public static void main(String [] args)
	{
		CircularLinkedList newList=new CircularLinkedList();
		newList.append(19);
		newList.append(8);
		newList.append(11);
		newList.append(29);
		newList.append(99);
		newList.display();
		
		
		
		
	}
	}

		
		
		




