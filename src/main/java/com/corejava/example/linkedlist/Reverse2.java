package com.corejava.example.linkedlist;

public class Reverse2 {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		
		System.out.println("Reverse1 => " + reverse1(head).data);
//		System.out.println("Middle Node Vector=> " + findMiddleVector(head));
	}
	
	//Iterative Approach
	public static Node reverse1(Node head) {
		Node curr = head;
		Node prev = null;
		Node next = null;
		
		while(null != head && null != head.next) {
			prev = head.next;
			head.next = curr;
			
			curr = head.next;
			
		}
		
		head.next = null;
		
		return head;
	}
}


