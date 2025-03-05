package com.corejava.example.interview;

public class Question1unsigned {

	public static void main(String[] args) {
		System.out.println(1l);
		System.out.println(1l << 32);  // result = x * 2^n = 1 * 2^32 = 4294967296
		
		long maxUnsignedInt = (1l << 32) - 1;
		System.out.println(maxUnsignedInt);
		
		String string = String.valueOf(maxUnsignedInt);
		System.out.println(string);
		
		int unsignedInt = Integer.parseUnsignedInt(string, 10);
		System.out.println(unsignedInt);
		System.out.println(string+"."+unsignedInt);
	}

}
