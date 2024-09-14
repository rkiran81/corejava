package com.corejava.example.linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Reverse1 {

	public static void main(String a[]) {
		LinkedList<String> ll=new LinkedList<String>();  
        ll.add("Ravi");  
        ll.add("Vijay");  
        ll.add("Ajay"); 
        System.out.println("Before Reverse => "+ll);
        
        Iterator<String> descendingIterator = ll.descendingIterator();
        System.out.println("After Reverse =>");
        while(descendingIterator.hasNext()) {
        	System.out.println(descendingIterator.next());
        }
        
        System.out.println("Before Reverse2 => " + ll);
        Collections.reverse(ll);
        System.out.println("After Reverse2 => " + ll);
        
        System.out.println("Before Reverse3 => " + ll);
        System.out.println("After Reverse3 => " + reverseLinkedList(ll));
        
        System.out.println("Before Reverse4 => " + ll);
        System.out.println("After Reverse4 => " + reverseLinkedList2(ll));
	}
	
	public static LinkedList<String> reverseLinkedList(LinkedList<String> llist)
    {
        LinkedList<String> revLinkedList = new LinkedList<String>();
        for (int i = llist.size() - 1; i >= 0; i--) {
 
            // Append the elements in reverse order
            revLinkedList.add(llist.get(i));
        }
        // Return the reversed arraylist
        return revLinkedList;
    }
	
	public static LinkedList<String> reverseLinkedList2(LinkedList<String> llist)
    {
        LinkedList<String> revLinkedList = new LinkedList<String>();
        int index = llist.size();
        while (index > 0) {
            // Append the elements in reverse order
            revLinkedList.add(llist.get(--index));
        }
        // Return the reversed arraylist
        return revLinkedList;
    }
	
}
