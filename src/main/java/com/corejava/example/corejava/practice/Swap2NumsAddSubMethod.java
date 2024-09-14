package com.corejava.example.corejava.practice;

public class Swap2NumsAddSubMethod {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		System.out.println(String.format("Before x => %d and y => %d", x, y));
		
		x = x + y;//15
		y = x - y;//10
		x = x - y;//5
		
		System.out.println(String.format("After x => %d and y => %d", x, y));
	}

}
