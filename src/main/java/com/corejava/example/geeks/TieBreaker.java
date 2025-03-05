package com.corejava.example.geeks;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Given an array of names arr[] of candidates in an election. 
 * A candidate name in array represents a vote casted to the candidate. You need to find the candidate with maximum 
 * votes recieved in the election. It may happen that two or more candidates may have same votes, 
 * in that case you need to return the name of the candidate which comes first lexicographically in dictionary.
 */

public class TieBreaker {

	public static void main(String[] args) {
		String[] names = {"Turin", "Nick", "Turin", "Nick"};
//		String[] names = {"Turin", "Nick", "Turin", "Nick", "Arun", "Arun", "Arun" };
//		String[] names = {"John", "Shushma", "Rajnath"};
//		String[] names = {"Malleg", "Praveen", "Nick", "Ankit", "Malleg", "Kurgenson", "Turin", "Johnsen", "Turin"};
		        
//		String key = Stream.of(names)
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//				.entrySet().stream()
//				.sorted(Comparator.comparing(Entry<String, Long>::getValue))
//				.findFirst().get().getKey();
		
		String key = Stream.of(names)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream()
				.sorted(
						Comparator
						.comparing(Entry<String, Long>::getValue).reversed()
						.thenComparing(Entry<String, Long>::getKey)
						)
				.findFirst().get().getKey();
//		Map<String, Long> collect = Stream.of(names)
//		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(key);
		
	}

}
