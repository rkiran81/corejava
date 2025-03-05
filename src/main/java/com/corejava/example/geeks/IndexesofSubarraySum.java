package com.corejava.example.geeks;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array arr[] containing only non-negative integers, 
 * your task is to find a continuous subarray (a contiguous sequence of elements) whose sum equals 
 * a specified value target. You need to return the 1-based indices of the leftmost and rightmost 
 * elements of this subarray. You need to find the first subarray whose sum is equal to the target.
 * Note: If no such array is possible then, return [-1].
 * 
 * 
 */
public class IndexesofSubarraySum {
	public static void main(String a[]) {
//		int arr[] = {1, 2, 3, 7, 5};
//		int target = 12;
//		System.out.println(subarraySum(arr, target));
		
//		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		int target = 15;
//		System.out.println(subarraySum(arr, target));
		
//		int arr[] = {5, 3, 4};
//		int target = 2;
//		System.out.println(subarraySum(arr, target));
		
		int arr[] = {12, 18, 5, 11, 30, 5};
		int target = 69;
		System.out.println(subarraySum1(arr, target));
	}
	
	static List<Integer> subarraySum(int[] arr, int target) {
		ArrayList<Integer> output = new ArrayList<>();
        int sum=0;
        boolean found = false;
        int lastIndex=0;
        for(int i =0; i <= arr.length - 1; i++){
        	System.out.println("i : "+i);
        	sum=0;
            for(int j = i; j <= arr.length - 1; sum+=arr[j++]){
            	System.out.println("j : "+j);
                if(sum == target){
                    found = true;
                    lastIndex = j;
                    break;
                }
            }
            if(found) {
            	output.add(i+1);
            	output.add(lastIndex);
            	break;
            }
        }
        
        if(output.isEmpty()){
            output.add(-1);
        }

        return output;
    }
	
	static ArrayList<Integer> subarraySum1(int[] arr, int target) {
        int firstIndex = -1;
		int lastIndex = 0;
		boolean found = false;
		int sum = 0;
		ArrayList<Integer> output = new ArrayList<>();
		while(firstIndex != arr.length - 1) {
			if(found)
				break;
			firstIndex++;
			sum = 0;
			for(int i=firstIndex; i<=arr.length-1; i++) {
				sum = sum+arr[i];
				if(sum == target) {
					found = true;
					lastIndex = i;
					break; 
				}
			}
		}
	
		if(!found && firstIndex == arr.length-1) {
		    output.add(-1);
		}else {
			output.add(firstIndex+1);
			output.add(lastIndex+1);
		}
		return output;
    }
}
