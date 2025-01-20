package com.corejava.examples.lambdas;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface SwitchIterface {
	public void swithOn();
	
	default void method1() {
		System.out.println("method1");
	}
	
	default void method2() {
		System.out.println("method2");
	}
	
	static void staticMethod1() {
		System.out.println("staticMethod1");
	}
}

public class FirstLambda {
	public static void main(String[] a) {
		SwitchIterface obj = () -> System.out.println("Switch On");
		obj.swithOn();
		
		obj.method1();
		SwitchIterface.staticMethod1();
	}
}
