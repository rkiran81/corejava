package com.corejava.example.corejava.practice;

public class Swap2NumsXORMethod {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		System.out.println(String.format("Before x => %d and y => %d", x, y));
		
		// Code to swap 'x' (1010) and 'y' (0101)
        x = x ^ y; // x now becomes 15 (1111)
        y = x ^ y; // y becomes 10 (1010)
        x = x ^ y; // x becomes 5 (0101)
		
		System.out.println(String.format("After x => %d and y => %d", x, y));
	}

}
