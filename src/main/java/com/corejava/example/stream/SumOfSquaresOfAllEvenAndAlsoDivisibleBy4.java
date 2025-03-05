package com.corejava.example.stream;

import java.util.Arrays;

public class SumOfSquaresOfAllEvenAndAlsoDivisibleBy4 {

	public static void main(String[] args) {
//		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		System.out.println(findSum(arr));
		System.out.println(findReduceSum(arr));
	}
	
	private static int findSum(int[] arr) {
		int sum = Arrays.stream(arr)
		.map(n-> n*n)
		.filter(n -> n%2 == 0 && n%4 == 0)
		.sum();
		return sum;
	}
	
	private static int findReduceSum(int[] arr) {
		int sum = Arrays.stream(arr)
		.map(n-> n*n)
		.filter(n -> n%2 == 0 && n%4 == 0)
		.reduce(0, (i,j)->i+j);
		return sum;
	}
}
