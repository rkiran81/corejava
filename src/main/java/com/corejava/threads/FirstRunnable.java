package com.corejava.threads;

public class FirstRunnable {

	public static void main(String[] args) {
		Runnable runnable = () -> {
			System.out.println("I am running in "+Thread.currentThread().getName());
		};
		
		Thread t = new Thread(runnable);
		t.setName("MyThread");
		t.start();//runs in thread t
		t.run();//Runs in main thread
	}

}
