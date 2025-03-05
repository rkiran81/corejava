package com.corejava.example.geeks;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/*
 * Given two integers a and b. Find the minimum value of a $ b 
 * where $ is any arithmetic operation like multiply( * ), Divide( / ), Addition( + ), Substraction( - ).
 * 
 */
public class MinimumOfAllArithmeticOperation {
	
	public static BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
	public static BiFunction<Integer, Integer, Integer> sub = (a, b) -> a - b;
	public static BiFunction<Integer, Integer, Integer> mul = (a, b) -> a * b;
	public static BiFunction<Integer, Integer, Integer> div = (a, b) -> a / b;

	public static void main(String[] args) {
		int a = 5, b = -5;
		System.out.println(findMinimum(a, b));
	}
	
	public static int findMinimum(int a, int b) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(add.apply(a, b));
		set.add(sub.apply(a, b));
		set.add(mul.apply(a, b));
		if(b != 0)
			set.add(div.apply(a, b));
		
		return set.first();
	}

}
