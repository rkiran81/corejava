package com.corejava.example.geeks;

//java list of integers find the sum of sqares that are even numbers and also divisible by 4
//https://github.com/ombharatiya/FAANG-Coding-Interview-Questions
import java.util.Arrays;
import java.util.List;

public class SumOfSquaresEvenAndDivisibleByFour {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumOfSquares = numbers.stream()
                                  .map(n -> n * n) // Square each number
                                  .filter(n -> n % 2 == 0 && n % 4 == 0) // Filter even numbers divisible by 4
                                  .reduce(0, Integer::sum); // Sum the filtered numbers

        System.out.println("Sum of squares of even numbers divisible by 4: " + sumOfSquares);

	}

}
