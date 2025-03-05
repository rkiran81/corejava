package com.corejava.threads;

import java.util.concurrent.ExecutorService;

public class Executors {
	public static void main(String[] a) {
		ExecutorService executor = java.util.concurrent.Executors.newSingleThreadExecutor();
		
		Runnable runnable = () -> System.out.println("In Runnable");
		
		executor.execute(runnable);//returns void
		executor.submit(runnable);//returns Future
	}
}
