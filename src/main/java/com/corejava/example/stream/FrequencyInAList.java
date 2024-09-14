package com.corejava.example.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FrequencyInAList {

	public static void main(String[] args) {
		
		List<Student> list = 
                new ArrayList<Student>(); 
		list.add(new Student("Ram", 19)); 
		list.add(new Student("Ashok", 20)); 
		list.add(new Student("Ram", 19)); 
		list.add(new Student("Ashok", 19));
		System.out.println(String.format("Frequency of Ram => %d", Collections.frequency(list, new Student("Ram", 19))));
	}

}
