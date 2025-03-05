package com.corejava.example.corejava.practice;

/**
 * The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1. 
 * The sequence goes: 0, 1, 1, 2, 3, 5, 8, 13, 21, and so on.
 * 
 * To identify if a given number is a Fibonacci number, you can use the property that a number 𝑛 
 * is a Fibonacci number if and only if one or both of 5𝑛2+4 or 5𝑛2−4 is a perfect square.
 * 
 * Square root of x means y * y = x
 */
public class Fibonacci {

	public static void main(String[] args) {
        int number = 21;
        boolean isFibonacci = isFibonacciNumber(number);
        System.out.println(number + " is a Fibonacci number: " + isFibonacci);
    }

    public static boolean isFibonacciNumber(int n) {
        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }

    public static boolean isPerfectSquare(int x) {
    	System.out.println("X => "+x);
        int s = (int) Math.sqrt(x);
        System.out.println("S => "+s);
        System.out.println("S * S => "+s*s);
        System.out.println("=================================");
        return s * s == x;
    }

}
