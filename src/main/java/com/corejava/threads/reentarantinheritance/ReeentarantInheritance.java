package com.corejava.threads.reentarantinheritance;

import java.util.concurrent.locks.ReentrantLock;

public class ReeentarantInheritance {
	public static void main (String[] args) {
		SubClass sunClass = new SubClass();
		
		Thread t1 = new Thread(sunClass::doSomething);
		Thread t2 = new Thread(sunClass::doSomething);
		
		t1.start();
		t2.start();
	}
}
	
	class SuperClass {
	    protected final ReentrantLock lock = new ReentrantLock();

	    public void doSomething() {
	        lock.lock();
	        try {
	            System.out.println("SuperClass: Lock acquired by " + Thread.currentThread().getName());
	            // Perform some work
	        } finally {
	            lock.unlock();
	            System.out.println("SuperClass: Lock released by " + Thread.currentThread().getName());
	        }
	    }
	}
	
	class SubClass extends SuperClass {
	    @Override
	    public void doSomething() {
	        lock.lock();
	        try {
	            System.out.println("SubClass: Lock acquired by " + Thread.currentThread().getName());
	            super.doSomething(); // Call superclass method
	            // Perform additional work
	        } finally {
	            lock.unlock();
	            System.out.println("SubClass: Lock released by " + Thread.currentThread().getName());
	        }
	    }
	}
