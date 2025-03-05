package com.corejava.example.pattern.singleton;

public class DoubleCheckingLazySingletonCloneableReflectionSerialization extends MyCloneableClass {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static DoubleCheckingLazySingletonCloneableReflectionSerialization instance;
	
	private DoubleCheckingLazySingletonCloneableReflectionSerialization() throws IllegalAccessException {
		// to avoid instance creation through reflection
		if(instance != null) {
			throw new IllegalAccessException("Use getInstance() method");
		}
	}

	public static DoubleCheckingLazySingletonCloneableReflectionSerialization getInstance() throws IllegalAccessException {
		if (instance == null) {
			synchronized (DoubleCheckingLazySingletonCloneableReflectionSerialization.class) {
				if (instance == null) {
					instance = new DoubleCheckingLazySingletonCloneableReflectionSerialization();
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
	
	public Object readResolve() {
		return instance;
	}
}
