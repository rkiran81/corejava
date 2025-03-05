package com.corejava.example.string;

import org.springframework.util.StringUtils;

public class String1 {

	public static void main(String[] args) {
		String testData1 = """
					first line
					second line
					third line
				""";
		String testData2 = "first line"
				+ "second line"
				+ "third line";
		String data = "data";
		data = data.concat("additionaldata");
		System.out.println(data);
		System.out.println(testData1);
		System.out.println(testData2);
	}

}
