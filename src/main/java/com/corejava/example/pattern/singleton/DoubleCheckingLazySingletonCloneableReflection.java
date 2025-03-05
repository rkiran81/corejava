package com.corejava.example.pattern.singleton;

public class DoubleCheckingLazySingletonCloneableReflection extends MyCloneableClass {
	
	private DoubleCheckingLazySingletonCloneableReflection() throws IllegalAccessException {
		// to avoid instance creation through reflection
		if(instance != null) {
			throw new IllegalAccessException("Use getInstance() method");
		}
	}

	private static DoubleCheckingLazySingletonCloneableReflection instance;

	public static DoubleCheckingLazySingletonCloneableReflection getInstance() throws IllegalAccessException {
		if (instance == null) {
			synchronized (DoubleCheckingLazySingletonCloneableReflection.class) {
				if (instance == null) {
					instance = new DoubleCheckingLazySingletonCloneableReflection();
				}
			}

		}
		return instance;
	}
	
	// to avoid instance creation through cloning
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	
}
