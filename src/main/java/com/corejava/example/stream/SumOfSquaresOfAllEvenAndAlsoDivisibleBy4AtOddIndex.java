package com.corejava.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumOfSquaresOfAllEvenAndAlsoDivisibleBy4AtOddIndex {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3,4,7,9,1,5);
		int[] arr = new int[] {3,4,7,9,1,5}; 
		System.out.println(findSum(numbers));
		System.out.println("============================");
		System.out.println(filterOddAndSquare(numbers));
		System.out.println("============================");
		filterOddPrint(numbers);
		System.out.println("============================");
		filterOddAndPull(numbers);
		System.out.println("============================");
		System.out.println(0%2);
		System.out.println(1%2);
		System.out.println(2%2);
		System.out.println(3%2);
	}
	
	private static int findSum(List<Integer> numbers) {
		return IntStream.range(0, numbers.size())
		.filter(i -> i % 2 != 0)
		.map(i -> numbers.get(i))
		.map(data -> data*data)
		.filter(data -> data%2 == 0 && data%4 == 0)
		.sum();
	}
	
	private static int filterOddAndSquare(List<Integer> numbers) {
		return IntStream.range(0, numbers.size())
				.filter(i -> i % 2 != 0)
				.map(i -> numbers.get(i))
				.map(data -> data*data)
				.filter(data -> data%2 == 0 && data%4 == 0)
				.reduce(0, Integer::sum);
	}
	
	private static void filterOddPrint(List<Integer> numbers) {
		IntStream.range(0, numbers.size()).filter(i -> i%2 != 0).forEach(System.out::println);
	}
	
	private static void filterOddAndPull(List<Integer> numbers) {
		IntStream.range(0, numbers.size())
		.filter(i -> i % 2 != 0)
		.map(i -> numbers.get(i))
		.forEach(System.out::println);
	}
}
