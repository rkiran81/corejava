package com.corejava.example.geeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * You are given an integer n and an integer array arr of size n+2. 
 * All elements of the array are in the range from 1 to n. 
 * Also, all elements occur once except two numbers which occur twice. 
 * Find the two repeating numbers.
 * Note: Return the numbers in their order of appearing twice. So, if x and y are repeating numbers, 
 * and x's second appearance comes before the second appearance of y, then the order should be (x, y).
 */

public class TwoRepeatedElements {

	public static void main(String[] args) {
		int n = 4;
		int arr[] = {1,2,2,1};
		System.out.println(twoRepeated(n, arr));
	}
	
	
	// Function to find two repeated elements.
	//{1=2, 3=5}
	//{1=3, 2=2}
    public static int[] twoRepeated(int n, int arr[]) {
    	// Your code here
        HashSet<Integer> seen = new HashSet<>();
        int[] result = new int[2];  
        int index = 0;  

        for (int i = 0; i < arr.length; i++) {
            if (seen.contains(arr[i])) {
                result[index] = arr[i];
                index++;
                if (index == 2) {
                    break;
                }
            } else {
                seen.add(arr[i]);
            }
        }

        return result;
    }
}
