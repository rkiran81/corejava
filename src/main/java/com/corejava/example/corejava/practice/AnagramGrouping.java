package com.corejava.example.corejava.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramGrouping {

	public static void main(String[] args) {
		Map<String, List<String>> anagramMap = new HashMap<>();
		String[] words = {"listen", "silent", "enlist", "hello", "world"};
		for(String word : words) {
			char[] charArray = word.toCharArray();
			Arrays.sort(charArray);
			String sortedWord = new String(charArray);
			anagramMap.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
			System.out.println(anagramMap);
		}
		
		
		List<String> otherWords = Arrays.asList("listen", "silent", "enlist", "inlets", "google", "goleog", "cat", "act");

        Map<String, List<String>> anagrams = otherWords.stream()
                .collect(Collectors.groupingBy(word -> word.chars()
                        .sorted()
                        .mapToObj(c -> String.valueOf((char) c))
                        .collect(Collectors.joining())));
        System.out.println(anagrams);

        // Print anagrams
        anagrams.values().stream()
                .filter(group -> group.size() > 1)
                .forEach(System.out::println);
	}
}
