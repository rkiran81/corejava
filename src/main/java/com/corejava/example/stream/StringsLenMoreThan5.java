package com.corejava.example.stream;

import java.util.Arrays;
import java.util.List;

public class StringsLenMoreThan5 {

	public static void main(String[] args) {
		
		List<String> stringList = Arrays.asList("abc", "abcdef", "abcdefg", "ab", "a", "abcdefgh");
		long count = stringList.stream().filter(x -> x.length() > 5).count();
		System.out.println(String.format("Count => %d", count));
		stringList.stream().filter(x -> x.length() > 5).forEach(System.out::println);
	}

}
