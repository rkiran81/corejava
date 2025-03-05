package com.corejava.example.geeks;

public class FindTransitionPoint {

	public static void main(String[] args) {
//		int arr[] = {0, 0, 0, 1, 1};
//		System.out.println(transitionPoint(arr));
		
//		int arr[] = {0, 0, 0, 0};
//		System.out.println(transitionPoint(arr));
		
//		int arr[] = {1,1,1};
//		System.out.println(transitionPoint(arr));
		
		int arr[] = {0, 1, 1};
		System.out.println(transitionPoint(arr));
	}
	
	static int transitionPoint(int arr[]) {
        int output = 0;
        boolean zeroFound = false;
        boolean oneFound = false;
        
        for(int i = 0; i < arr.length; i++) {
        	if(!zeroFound)
        		zeroFound = zeroFound(arr[i]);
        	if(!oneFound)
        		oneFound = oneFound(arr[i]);
        	
        	if(zeroFound && oneFound) {
        		return i;
        	}
        }
		
        if(zeroFound & !oneFound)
        	output = -1;
        if(!zeroFound & oneFound)
        	output = 0;
        
		return output;
    }
	
	static public boolean zeroFound(int a) {
		return 0 == a;
	}
	
	static public boolean oneFound(int a) {
		return 1 == a;
	}
}
