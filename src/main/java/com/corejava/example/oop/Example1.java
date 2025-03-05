package com.corejava.example.oop;

public class Example1 {
	
	int i;
	int j;
	
	public Example1() {
		j=2;
	}
	
	public Example1(int a,int b) {
		this();
		i = a;
		j = b;
	}
	
	public static void main(String[] a) {
		Example1 ex = new Example1(2, 5);
		System.out.println(ex.i+" "+ex.j);
	}
}
