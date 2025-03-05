package com.corejava.example.interview;

import java.util.LinkedHashSet;

public class QuestionLinkedhashset {

	public static void main(String[] args) {
		LinkedHashSet lhashSet = new LinkedHashSet();
		lhashSet.add(new Integer(1));
		lhashSet.add(new Integer(2));
		lhashSet.add(new Integer(3));
		lhashSet.add(new Integer(3));
		lhashSet.add(new Integer(5));
		lhashSet.add(new Integer(4));
		lhashSet.add(new Integer(5));
		lhashSet.add(new Integer(5));
		
		Object[] array = lhashSet.toArray();
		for(Object element : array) {
			System.out.println(element + " ");
		}
	}

}
