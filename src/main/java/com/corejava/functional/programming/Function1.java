package com.corejava.functional.programming;

import java.util.List;
import java.util.function.Predicate;

public class Function1 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
		System.out.println(addAll(numbers));
		System.out.println(addAllEven(numbers));
		System.out.println(addAllOdd(numbers));
		
		System.out.println("======================================");
		
		System.out.println(addAllFunction(numbers, num -> true));
		System.out.println(addAllFunction(numbers, num -> num % 2 == 0));
		System.out.println(addAllFunction(numbers, num -> num % 2 != 0));
	}
	
	private static int addAllFunction(List<Integer> numbers, Predicate<Integer> predicate) {
		int output = 0;
		for(Integer num : numbers) {
			if(predicate.test(num))
			 output += num;
		}
		return output;
	}
	
	private static int addAll(List<Integer> numbers) {
		int output = 0;
		for(Integer num : numbers) {
			output += num;
		}
		return output;
	}
	
	private static int addAllEven(List<Integer> numbers) {
		int output = 0;
		for(Integer num : numbers) {
			if(num % 2 == 0)
				output += num;
		}
		return output;
	}
	
	private static int addAllOdd(List<Integer> numbers) {
		int output = 0;
		for(Integer num : numbers) {
			if(num % 2 != 0)
				output += num;
		}
		return output;
	}
}
