package com.corejava.example.linkedlist;

import java.util.Vector;

public class FindMiddleHareAndTortiseFloydsCycleAlgo {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		
		System.out.println("Middle Node Floyd's => " + findMiddleFloyd(head).data);
		System.out.println("Middle Node Vector=> " + findMiddleVector(head));
	}
	
	//Hare And Tortise/Floyd's Cycle Algorithm
	public static Node findMiddleFloyd(Node head) {
		Node slowPtr = head;
		Node fastPtr = head;
		
		while(null != fastPtr && null != fastPtr.next) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
		}
		
		return slowPtr;
	}
	
	public static int findMiddleVector(Node head) {
		Vector<Integer> vector = new Vector<>();
		
		while(head != null) {
			vector.add(head.data);
			head = head.next;
		}
		
		int index = vector.size()/2;
		System.out.println("findMiddleVector index => " + index);
		return vector.get(index);
	}
}



