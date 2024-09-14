package com.corejava.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumOfAllEvenNumbers {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int sum1 = numbers.stream().filter(x -> x % 2 == 0).mapToInt(x -> x).sum();
		System.out.println(String.format("Sum1 => %d", sum1));
		
		int sum2 = IntStream.of(1,2,3,4,5,6,7,8,9,10).filter(x -> x % 2 == 0).sum();
		System.out.println(String.format("Sum2 => %d", sum2));
		
		int sum3 = IntStream.of(1,2,3,4,5,6,7,8,9,10).sum();
		System.out.println(String.format("Sum3 => %d", sum3));
		
		int sum4 = IntStream.of(1,2,3,4,5,6,7,8,9,10).reduce(0, (x,y)->x+y);
		System.out.println(String.format("Sum4 => %d", sum4));
	}

}
