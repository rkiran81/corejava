package com.corejava.example.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class SampleHashset {

	public static void main(String[] args) {
		//private static final Object PRESENT = new Object();
		//map = new HashMap<>();default initial capacity (16) and load factor (0.75).
		Set<String> set =new HashSet<>();
		set.add("a");//return map.put(e, PRESENT)==null;
		set.add(null);
		set.add("b");
		set.add(null);
		System.out.println(set);//[null, a, b]
		
//		map = new LinkedHashMap<>(initialCapacity, loadFactor);
//		super(16, .75f, true);
		Set<String> set1 =new LinkedHashSet<>();
		set1.add("a");
	}

}
