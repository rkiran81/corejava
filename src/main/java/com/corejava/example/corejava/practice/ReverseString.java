package com.corejava.example.corejava.practice;

public class ReverseString {

	public static void main(String[] args) {
		String original = "Hello, world!";
		char[] charArray = original.toCharArray();
		System.out.println(reverse(charArray));
	}
	
	public static String reverse(char[] data) {
		
		int left = 0;
		int right = data.length - 1;
		while(left < right) {
			char temp = data[left];
			data[left] = data[right];
			data[right] = temp;
			
			left++;
			right--;			
		}
		
		return String.valueOf(data);
	}

}
