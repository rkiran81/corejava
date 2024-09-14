package com.corejava.example.stream;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class FrequencyInAMap {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();  
		//adding values to the Map  
		map.put(1, "Olivia");  
		map.put(2, "Noah");  
		map.put(3, "John");  
		map.put(4, "Alex");  
		map.put(5, "Emma");  
		map.put(6, "Amelia");  
		map.put(7, "Noah");  
		BiFunction<Integer, String, String> a = (key, value) -> "[Key="+key+", "+value+"("+Collections.frequency(map.values(), value)+")]";
		BiFunction<Integer, String, String> b = (key, value) -> "[Key="+key+","+value+"("+String.valueOf(Collections.frequency(map.values(), value))+")]";
		map.forEach((k,v)-> System.out.println(b.apply(k, v)));
	}

}
