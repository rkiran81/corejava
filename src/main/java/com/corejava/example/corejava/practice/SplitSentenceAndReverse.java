package com.corejava.example.corejava.practice;

import java.util.Arrays;
import java.util.stream.Stream;

public class SplitSentenceAndReverse {

	public static void main(String[] args) {
		String sentence = "This is a test sentence";
		func1(sentence);
		func2(sentence);
	}
	
	public static void func1(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        
        // Reverse the order of words
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i != 0) {
                reversedSentence.append(" ");
            }
        }
        
        // Print the reversed sentence
        System.out.println(reversedSentence.toString());
	}
	
	public static void func2(String sentence) {
		// Split the sentence including spaces
        String[] parts = sentence.split("(?<=\\s|\\S)(?=\\s|\\S)");
        
        // Print the result
        Stream.of(parts).forEach(System.out::println);
	}

}
