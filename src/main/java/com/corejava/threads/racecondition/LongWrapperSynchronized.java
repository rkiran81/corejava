package com.corejava.threads.racecondition;

public class LongWrapperSynchronized {
	
	private Object key = new Object();
	private long l;

	public LongWrapperSynchronized(long l) {
		super();
		this.l = l;
	}

	public long getValue() {
		return l;
	}

	public void incrementValue() {
		synchronized (key) {
			l = l + 1;
		}
	}
	
	
}
