package com.corejava.example.corejava.practice;

import java.util.Arrays;

public class JavaArray {

	public static void main(String[] args) {
		String[] array = {"John", "Mahta", "Sara"};
		System.out.println(array);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.deepToString(array));//only supports objects
		System.out.println(String.format("-", Arrays.asList(array)));
		
		String word = "Hello";
        String[] letters = word.split("");

        for (String letter : letters) {
            System.out.println(letter);
        }
        
        String numberString = "123456";
        int[] numbers = numberString.chars()
                                    .map(Character::getNumericValue)
                                    .toArray();

        System.out.println(Arrays.toString(numbers));
        
        String[] stringArray = {"1", "2", "3", "4", "5"};
        int[] intArray = Arrays.stream(stringArray)
                               .mapToInt(Integer::parseInt)
                               .toArray();
        System.out.println(Arrays.toString(intArray));
	}

}
