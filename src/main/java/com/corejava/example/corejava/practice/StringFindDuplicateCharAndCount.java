package com.corejava.example.corejava.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class StringFindDuplicateCharAndCount {

	public static void main(String[] args) {
		LinkedHashMap<Character, Integer> data1 = new LinkedHashMap<Character, Integer>();
		LinkedHashMap<String, Integer> data2 = new LinkedHashMap<String, Integer>();
		Map<Character, Integer> data3 = new HashMap<Character, Integer>();
		String data = "manojpandey";
		/////////////////////////////////////////////////////////////////
		data.chars()
		.forEach(ch1 -> {
			Integer computeIfPresent = data1.computeIfPresent((char)ch1, (key, val) -> val + 1);
			if(null == computeIfPresent) {
				data1.put((char)ch1, 1);
			}
		});
		System.out.println(data1);
		/////////////////////////////////////////////////////////////////
		data.codePoints().mapToObj(c -> String.valueOf((char) c))
		.forEach(ch1 -> {
			Integer computeIfPresent = data2.computeIfPresent(ch1, (key, val) -> val + 1);
			if(null == computeIfPresent) {
				data2.put(ch1, 1);
			}
		});
		System.out.println(data2);
		
		
		BiFunction<Character, Integer, Integer> computeIfPresentBiFunc = (x, y) -> y + 1;
		data.chars().forEach(ch -> {
			Integer computeIfPresent = data3.computeIfPresent((char)ch, computeIfPresentBiFunc);
			if(null == computeIfPresent) {
				data3.put((char)ch, 1);
			}
		});
		System.out.println(data3);
		Map<Character, Integer> collect = data3.entrySet().stream().filter(ch -> ch.getValue() > 1).collect(Collectors.toMap(ch1 -> ch1.getKey(), ch1 -> ch1.getValue()));
		System.out.println(collect);
	}

}
