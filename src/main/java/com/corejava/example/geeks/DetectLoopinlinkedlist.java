package com.corejava.example.geeks;

import java.util.HashSet;
import java.util.Set;

///https://github.com/ombharatiya/FAANG-Coding-Interview-Questions

public class DetectLoopinlinkedlist {

	public static void main(String[] args) {
//		Node head = new Node(1);
//		head.next = new Node(2);
//		head.next.next = new Node(3);
//		head.next.next.next = new Node(4);
//		head.next.next.next.next = new Node(5);
//		head.next.next.next.next.next = new Node(6);
//		
//		System.out.println(detectLoop(head)); //false
//		System.out.println(findCycleFloyd(head)); //false
		
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = head.next.next;
		
		System.out.println(detectLoop(head));//true
		System.out.println(findCycleFloyd(head)); //true
	}
	
	public static boolean detectLoop(Node head) {
		
		Set<Node> nodes = new HashSet<>();
		nodes.add(head);
		while(head.next != null) {
			boolean added = nodes.add(head.next);
			if(!added)
				return true;
			head = head.next;
		}
		return false;
    }
	
	public static boolean findCycleFloyd(Node head) {
		Node tor = head;
		Node hare =head;
		
		while(tor.next != null && hare.next.next != null) {
			tor = tor.next;
			hare = hare.next.next;
			
			if(tor == hare) {
				return true;
			}
		}
		
		return false;
    }
}

class Node{
	int data;
	Node next;
	Node(int x){
		data = x;
		next = null;
	}
}
