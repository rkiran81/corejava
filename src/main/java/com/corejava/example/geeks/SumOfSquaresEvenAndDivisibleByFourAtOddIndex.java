package com.corejava.example.geeks;

//java given list of integers find the sum of sqares that are even numbers and also divisible by 4 that are at odd index
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumOfSquaresEvenAndDivisibleByFourAtOddIndex {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumOfSquares = IntStream.range(0, numbers.size())
                                    .filter(i -> i % 2 != 0) // Filter odd indices
                                    .map(i -> numbers.get(i)) // Get the element at the odd index
                                    .map(n -> n * n) // Square each number
                                    .filter(n -> n % 2 == 0 && n % 4 == 0) // Filter even numbers divisible by 4
                                    .sum(); // Sum the filtered numbers

        System.out.println("Sum of squares of even numbers divisible by 4 at odd indices: " + sumOfSquares);

	}

}
