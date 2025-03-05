package com.corejava.example.corejava.practice;

/**
 * A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward 
 * (ignoring spaces, punctuation, and capitalization). Examples of palindromes include "madam," "racecar," and "12321."
 */
public class Palindrome {

	public static void main(String[] args) {
        String word = "racecar";
        boolean isPalindrome = isPalindrome(word);
        System.out.println(word + " is a palindrome: " + isPalindrome);
        isPalindrome = isPalindroneRawMethod(word);
        System.out.println(word + " is a isPalindroneRawMethod: " + isPalindrome);
        
        word = "12321";
        isPalindrome = isPalindrome(word);
        System.out.println(word + " is a palindrome: " + isPalindrome);
        isPalindrome = isPalindroneRawMethod(word);
        System.out.println(word + " is a isPalindroneRawMethod: " + isPalindrome);
    }

    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
    
    private static boolean isPalindroneRawMethod(String str) {
    	boolean isPalindrome = true;
    	
    	String[] arr = str.split("");
    	int startIndex = 0;
    	int endIndex = str.length()-1;
    	while(startIndex < endIndex) {
    		if(!arr[startIndex].equals(arr[endIndex])) {
    			isPalindrome = false;
    			break;
    		}
    	startIndex++;
    	endIndex--;
    	}
    	
    	return isPalindrome;
    }
}
