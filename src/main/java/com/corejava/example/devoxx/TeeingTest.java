package com.corejava.example.devoxx;

import java.util.List;
import java.util.stream.Collectors;

public class TeeingTest {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        var result = numbers.stream()
            .collect(Collectors.teeing(
                Collectors.summingInt(Integer::intValue), // First collector: sum of all elements
                Collectors.averagingInt(Integer::intValue), // Second collector: average of all elements
                (sum, avg) -> String.format("Sum: %d, Average: %.2f", sum, avg) // Merger function: combining results
            ));

        System.out.println(result);

	}

}
