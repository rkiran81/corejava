package com.corejava.example.geeks;

/**
 * You have given two sorted arrays arr1[] & arr2[] of distinct elements. 
 * The first array has one element extra added in between. Return the index of the extra element.
 * Note: 0-based indexing is followed.
 */

public class IndexofanExtraElement {

	public static void main(String[] args) {
//		int a[] = {2,4,6,8,9,10,12};
//		int b[] = {2,4,6,8,10,12};
//		System.out.println(findExtra(a, b));
//		
//		int a[] = {3,5,7,8,11,13};
//		int b[] = {3,5,7,11,13};
//		System.out.println(findExtra(a, b));
		
		int a[] = {3,5};
		int b[] = {3};
		System.out.println(findExtra(a, b));

	}
	
	public static int findExtra(int a[], int b[]) {
		int firstrrLength =a.length;
		int secondArrLength = b.length;
		if(secondArrLength > firstrrLength) {
			int[] temp = a;
			a=b;
			b=temp;
		}
		int missing = 0;
		for(int i = 0; i < a.length; i++) {
			
			if(i == b.length || a[i] != b[i]) {
				missing = a[i];
				break;
			}
		}

		return missing;
    }
}
