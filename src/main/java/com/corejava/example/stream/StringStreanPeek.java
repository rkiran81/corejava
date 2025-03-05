package com.corejava.example.stream;

import java.util.stream.Stream;

public class StringStreanPeek {

	public static void main(String[] args) {
		String[] arr =new String[] {"a","b","c", "d", "e","f", "g","h"};
		Stream.of(arr)
		.parallel()
		.filter(data -> data.compareTo("d") > 0)
		//This method exists mainly to support debugging, where you want to see the elements as they flow past a certain point in a pipeline
		.peek(e-> System.out.println("Filtered value: " + e))
		.map(String::toUpperCase)
//		.peek(e-> System.out.println("Filtered value: " + e))
//		.map(String::toUpperCase)
		.forEach(System.out::println);
		
		System.out.println("===========================");
		
		Stream.of("one", "two", "three", "four")
		.parallel()
	     .filter(e -> e.length() > 3)
	     .peek(e -> System.out.println("Filtered value: " + e))
	     .map(String::toUpperCase)
	     .peek(e -> System.out.println("Mapped value: " + e))
	     .forEach(System.out::println);

	}

}
