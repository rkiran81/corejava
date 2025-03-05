package com.corejava.example.devoxx;

import java.util.stream.IntStream;

public class SequentialAndParallelStream {

	public static void main(String[] args) {
		System.out.println("======Sequential======");
		long start = System.currentTimeMillis();
		IntStream.rangeClosed(1, 10)
			.map(num -> transform(num))
			.forEach(System.out::println);
		long end = System.currentTimeMillis();
		System.out.println("======Sequential timetaken - " + (end-start)/1000 +"secs");
		
		System.out.println("======Parallel======");
		start = System.currentTimeMillis();
		IntStream.rangeClosed(1, 10)
			.parallel()
			.map(num -> transform(num))
			.forEachOrdered(System.out::println);// ordered if source is ordered
		end = System.currentTimeMillis();
		System.out.println("======Parallel timetaken - " + (end-start)/1000 +"secs");
	}

	private static int transform(int num) {
		System.out.println(num +" - running on thread - " + Thread.currentThread().getName());
		sleep(1000);
		return num;
	}

	private static void sleep(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
