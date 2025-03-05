package com.corejava.example.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SampleArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add(null);
		list.add("b");
		list.add(null);
		list.add("b");
		System.out.println(list);//[a, null, b, null, b]
		
		list.add(null); //0(1)
		list.get(0);//0(1)
		list.remove(0);//0(n) because all elements must be shifted
		list.remove(new Object());//0(n)
		list.contains(new Object());//0(n)
		
		List<String> linked = new LinkedList<>();
		linked.add("a");//o(1)
		linked.get(0);//0(n)
		linked.remove(0);//0(1)
		linked.remove(new Object());//0(1)
		linked.contains(new Object());//0(n)
	}

}
