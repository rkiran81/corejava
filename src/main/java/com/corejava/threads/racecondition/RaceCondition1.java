package com.corejava.threads.racecondition;

public class RaceCondition1 {

	public static void main(String[] args) throws InterruptedException {
		LongWrapper longWrapper = new LongWrapper(0L);
		
		Runnable runnable = () -> {
			for(int i = 0; i < 1_000; i++) {
				longWrapper.incrementValue();
			}
		};
		
		Thread t = new Thread(runnable);
		t.start();
		
		t.join();
		
		System.out.println("Value = "+longWrapper.getValue());
	}

}
