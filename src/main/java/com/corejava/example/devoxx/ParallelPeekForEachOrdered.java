package com.corejava.example.devoxx;

import java.util.stream.IntStream;

public class ParallelPeekForEachOrdered {

	public static void main(String[] args) {
		IntStream.rangeClosed(1, 8)
		.parallel()
		.peek(System.out::println)
		.forEachOrdered(System.out::println);
	}

}
