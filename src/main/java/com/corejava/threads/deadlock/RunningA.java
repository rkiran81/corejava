package com.corejava.threads.deadlock;

public class RunningA {

	public static void main(String[] args) throws InterruptedException {
		A a = new A();
		
		Runnable r1 = () -> a.a();
		Runnable r2 = () -> a.b();
		
		Thread t1 = new Thread(r1);
		t1.start();
		
		Thread t2 = new Thread(r2);
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Finish t1 and t2");
	}

}
