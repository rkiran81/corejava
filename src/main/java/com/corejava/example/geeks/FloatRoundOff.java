package com.corejava.example.geeks;

import java.util.ArrayList;

public class FloatRoundOff {

	public static void main(String[] args) {
		float a = 5.43f;
		float b =2.653f;
		
		float c = a/b;
		System.out.println(c);
		String format = String.format("%.3f", c);
		System.out.println(format);
		float result = Float.valueOf(format);
		System.out.println(result);
		
		System.out.println("=============");
		System.out.println(divisionWithPrecision(a, b));
	}
	
	static ArrayList<Float> divisionWithPrecision(float a, float b) {
        ArrayList<Float> output = new ArrayList<>();
        float exactResult = a/b;
        String format = String.format("%.3f", exactResult);
		System.out.println(format);
		float finalResult = Float.valueOf(format);
		output.add(Float.valueOf(exactResult));
		output.add(Float.valueOf(finalResult));
        return output;
    }

}
