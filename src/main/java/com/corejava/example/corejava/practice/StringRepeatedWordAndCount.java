package com.corejava.example.corejava.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringRepeatedWordAndCount {

	public static void main(String[] args) {
		Map<Character, Integer> data1 = new LinkedHashMap<Character, Integer>();
		Map<String, Integer> data2 = new LinkedHashMap<String, Integer>();
		Map<String, Integer> data3 = new HashMap<String, Integer>();
		String data = "I am a java developer and I am proud as developer";
		/////////////////////////////////////////////////////////////////
		data.chars()
		.forEach(ch1 -> {
			Integer computeIfPresent = data1.computeIfPresent((char)ch1, (key, val) -> val + 1);
			if(null == computeIfPresent) {
				data1.put((char)ch1, 1);
			}
		});
		data1.entrySet().forEach(bi -> {
			if(bi.getValue() > 1) {
				System.out.println(bi.getKey()+"-"+bi.getValue());
			}
		});
		/////////////////////////////////////////////////////////////////
		data.codePoints().mapToObj(c -> String.valueOf((char) c))
		.forEach(ch1 -> {
			Integer computeIfPresent = data2.computeIfPresent(ch1, (key, val) -> val + 1);
			if(null == computeIfPresent) {
				data2.put(ch1, 1);
			}
		});
		data2.entrySet().forEach(bi -> {
			if(bi.getValue() > 1) {
				System.out.println(bi.getKey()+"-"+bi.getValue());
			}
		});
		
		//////////////////////////////working/////////////////////////////
		System.out.println(Arrays.toString(data.split(" ")));
		Stream.of(data.split(" ")).forEach(str -> {
			Integer computeIfPresent = data3.computeIfPresent(str, (key, val) -> val +1);
			if(null == computeIfPresent) {
				data3.put(str, 1);
			}
		});
		Map<String, Integer> collect = data3.entrySet().stream().filter(str -> str.getValue() > 1).collect(Collectors.toMap(key -> key.getKey(), val -> val.getValue()));
		System.out.println(collect);
	}

}
