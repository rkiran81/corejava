package com.corejava.example.pattern.singleton;

public class DoubleCheckingLazySingletonCloneable extends MyCloneableClass {
	private DoubleCheckingLazySingletonCloneable() {}

	private static DoubleCheckingLazySingletonCloneable instance;

	public static DoubleCheckingLazySingletonCloneable getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckingLazySingletonCloneable.class) {
				if (instance == null) {
					instance = new DoubleCheckingLazySingletonCloneable();
				}
			}

		}
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	
}
