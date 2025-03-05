package com.corejava.example.geeks;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/*
 * Check if the number is less than 2: If the number is less than 2, it is not a prime number.
 * Check if the number is 2: If the number is 2, it is a prime number (since 2 is the smallest prime number and the only even prime number).
 * Check for divisibility:
 * Start by checking if the number is divisible by any integer from 2 up to the square root of the number (inclusive).
 * If the number is divisible by any of these integers, it is not a prime number.
 * If the number is not divisible by any of these integers, it is a prime number.
 * Let's illustrate this with an example: 29
 * 29 is greater than 2.
 * It's not divisible by 2, 3, 4, or 5 (integers up to the square root of 29).
 * Therefore, 29 is a prime number.
 */

public class NextPrimeGreaterThanN {
	
	/*
	 * Given an integer n. Write a program to find the first prime number greater than n.
	 */
	public static void main(String[] args) {
		int n = 7;
		boolean isPrime = false;
		while(!isPrime) {
			isPrime = isPrime(++n);
		}
		System.out.println("isPrime "+ n);
	}
	
	public static boolean isPrime(int n) {
		return IntStream.rangeClosed(2, (int)Math.sqrt(n)).noneMatch(i -> n % i == 0);
		
	}

}
