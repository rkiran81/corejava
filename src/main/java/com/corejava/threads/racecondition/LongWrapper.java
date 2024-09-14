package com.corejava.threads.racecondition;

public class LongWrapper {
	private long l;

	public LongWrapper(long l) {
		super();
		this.l = l;
	}

	public long getValue() {
		return l;
	}

	public void incrementValue() {
		l = l + 1;
	}
	
	
}
