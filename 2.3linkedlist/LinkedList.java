import java.util.Scanner;
public class LinkedList 
{
	private  Node head, tail;
	  static class Node 
	  { 
	      int data; 
	      Node next; 
	      Node(int d)  { data = d;  next=null; }// Constructor
	  }
	  public LinkedList()
	  {
		  head = null;
		  tail = null;
	  }
	  public void createnode (int value)
	  {
		  Node temp = new Node(value);
		  if (head == null)
		  {
			  head = temp;
			  tail = temp;
			  temp = null;
		  }
		  else 
		  {
			  tail.next = temp;
			  tail = temp;
		  }
	  }
	  void display()
	  {
		  Node temp=head;
		  while (temp!= null)
		  {
			  System.out.print(temp.data + "-->");
			  temp = temp.next;
		  }
		  System.out.println("NULL");
	  }
	  void insert_start(int value)
	  {
		  Node temp=new Node(value);
		    temp.data=value;
		    temp.next=head;
		    head=temp;
	  }
	  void insert_end(int value)
	  {
		  Node temp = new Node (value);
		    temp.data=value;
		    temp.next=null;
		    tail.next=temp;
		    tail=temp;
	  }
	  void insert_position(int pos ,int value)
	  {
		  Node temp = new Node(value);
		  Node cur = new Node(value);
		  Node pre = new Node(value);
		  cur = head;
		  for (int i=1; i<pos; i++)
		  {
			  pre = cur;
			  cur = cur.next;
		  }
		  temp.data = value;
		  pre.next = temp;
		  temp.next = cur;		 
	  }
	  void delete_last()
	  {
		  int value =0;
		  Node previous = new Node(value);
		  Node current = new Node(value);
		  while (current.next != null)
		  {
			  previous = current;
			  current = current.next; 
		  }
		  tail = previous;
		  previous.next = null;				  		  
	  }
	  void delete_first()
	  {
		  int value = 0;
		  Node temp = new Node(value);
		  temp = head;
		  head = head.next;
	  }
	  void delete_position(int pos)
	  {
		  Node previous = new Node(pos);
		  Node current = new Node(pos);
		  current = head;
		  for (int i=1; i<pos; i++)
		  {
			  previous = current;
			  current = current.next;
		  }
		  previous.next = current.next;
	  }

public static void main(String[] arg)  
{  

LinkedList L = new LinkedList() ;

int n;

Scanner keyboard = new Scanner(System.in);
System.out.print("n = ");
n = keyboard.nextInt();

//input
for (int i= 1;i<=n; i++)
{
	int value;

	System.out.print("value = ");
	value = keyboard.nextInt();
	
	L.createnode(value);
}
//display

L.display();
}
}