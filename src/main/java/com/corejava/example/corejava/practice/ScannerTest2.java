package com.corejava.example.corejava.practice;

import java.util.Scanner;

public class ScannerTest2 {
	public static void main(String[] a) {
		Geeks g = new Geeks();
		g.getInput();
	}
}

class Geeks {
	static void getInput () {
		
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Before t");
	    int t=sc.nextInt(); //Taking the number of testcases
	    System.out.println("After t");
	    sc.nextLine(); 
	    while(t-->0)
	    {
	    	System.out.println("Before a");
    		int a = sc.nextInt(); 
    		System.out.println("After a");
    		
    		// Consume the leftover newline character
    		//This issue commonly occurs because scanner.nextInt() does not consume 
    		//the newline character (\n) after reading an integer. As a result, 
    		//when you call scanner.nextLine(), it reads the leftover newline character instead of 
    		//waiting for user input.
    		sc.nextLine(); 
    		
    		System.out.println("Before s");
    	    String s = sc.nextLine();
    	    System.out.println("After s");
    	    
    	    //Your code here
    
    		System.out.println(a);
    		System.out.println(s);
	    }
	
	}
}
