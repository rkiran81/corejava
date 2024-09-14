package com.corejava.threads.racecondition;

public class RaceConditionFixed {

	public static void main(String[] args) throws InterruptedException {
		LongWrapperSynchronized longWrapper = new LongWrapperSynchronized(0L);
		
		Runnable runnable = () -> {
			for(int i = 0; i < 1_000; i++) {
				longWrapper.incrementValue();
			}
		};
		
		Thread[] threads = new Thread[1_000];
		for(int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(runnable);
			threads[i].start();
		}
		
		for(int i = 0; i < threads.length; i++) {
			threads[i].join();
		}
		
		System.out.println("Value = "+longWrapper.getValue());
	}

}
