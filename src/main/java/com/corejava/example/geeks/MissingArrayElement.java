package com.corejava.example.geeks;

import java.util.Arrays;

public class MissingArrayElement {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 5};
		System.out.println(missingNumber(arr));
		
//		int arr[] = {8, 2, 4, 5, 3, 7, 1};
//		System.out.println(missingNumber(arr));
		
//		int arr[] = {1};
//		System.out.println(missingNumber(arr));
	}
	
	
	static int missingNumber(int arr[]) {
		Arrays.sort(arr);
		int sum = 1;
		for(int i = 0; i < arr.length; i++) {
			if(sum != arr[i]) {
				break;
			}else {
				sum+=1;
			}
		}
		return sum;
    }
}	
