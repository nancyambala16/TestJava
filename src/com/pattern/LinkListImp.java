package com.pattern;

public class LinkListImp {
 
	Node head;
	class Node{
		
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	
	}
	
	public void printLinklist()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	
	public static void main(String[] args) {
		

		LinkListImp ll=new LinkListImp();
		Node first=ll.new Node(10);
	    ll.head=first;
	    Node second=ll.new Node(20);
	    first.next=second;
	    Node third=ll.new Node(20);
	    second.next=third;
	    
	ll.printLinklist();
		
	}
}
