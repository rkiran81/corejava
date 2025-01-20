package com.corejava.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfCharsInGivenWord {

	public static void main(String[] args) {
		String word = "abcacdefbeshtsabec";
		Map<String, Integer> wordsMap = new HashMap<>();
		Stream.of(word.split("")).forEach(c -> {
			wordsMap.merge(c, Integer.valueOf(1), Integer::sum);
		});
		System.out.println(wordsMap);
		
		word = "KiranKumar";
		wordsMap.clear();
		Arrays.stream(word.split("")).forEach(c -> {
			wordsMap.merge(c, Integer.valueOf(1), Integer::sum);
		});
		System.out.println(wordsMap);
		
		word = "KiranKumar";
		wordsMap.clear();
		Map<String, Long> collect = Arrays.stream(word.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);
	}

}
