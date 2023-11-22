package linked_list;

public class LinkedList {
	
   private Node head;	
   
  
   private static class Node{
	   
	   private int data;
	   private Node next;
	   
	   public Node(int data)
	   {
		   this.data=data;
		   this.next=null;
	   }
   }
   
   public void addNode(int data)
   {
	  Node newNode=new Node(data);
	  if(head== null)
	  {
		  head=newNode;
	  }
	  
	  else
	  {
		  Node currentNode=head;
		  while(currentNode.next!= null)
		  {
			  currentNode=currentNode.next;
		  }
		  currentNode.next=newNode;
	  }
   }
   
   
   public void deleteNode()
   {
	   if(head== null)
	   {
		   System.out.println(" u cant delete it");
	   }
	   else
	   {
		   
		   head=head.next;
	   }
	   
	   
	   
   }
   
   public void printList()
   {
	   Node currentNode=head;
	   while(currentNode!= null)
	   {
		   System.out.print(currentNode.data + " ");
		   currentNode=currentNode.next;
		   
	   }
	   System.out.println();
   }

	public static void main(String[] args) {
		
     LinkedList newList = new LinkedList();
     newList.addNode(10);
     newList.addNode(20);
     newList.addNode(30);
     newList.addNode(50);
     newList.printList();
     newList.deleteNode();
     newList.deleteNode();
     newList.deleteNode();
     newList.printList();      
	}

}
