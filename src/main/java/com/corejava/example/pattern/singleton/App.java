package com.corejava.example.pattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
	public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException, ClassNotFoundException {
//		System.out.println("Hello World!");
//
//		LazzyInnerClassSingleton obj1 = LazzyInnerClassSingleton.getInstance();
//
//		System.out.println(obj1.hashCode());
//
//		LazzyInnerClassSingleton obj2 = LazzyInnerClassSingleton.getInstance();
//
//		System.out.println(obj2.hashCode());
		
													//CLONE
//		DoubleCheckingLazySingletonCloneable obj1 = DoubleCheckingLazySingletonCloneable.getInstance();
//		DoubleCheckingLazySingletonCloneable obj2 = (DoubleCheckingLazySingletonCloneable)obj1.clone();
//		System.out.println(obj1.hashCode());
//		System.out.println(obj2.hashCode());
		
													//REFLECTION
//		DoubleCheckingLazySingletonCloneableReflection obj1 = DoubleCheckingLazySingletonCloneableReflection.getInstance();
//		System.out.println(obj1.hashCode());
//		
//		DoubleCheckingLazySingletonCloneableReflection obj2 = null; 
//		Constructor<?>[] constructors = DoubleCheckingLazySingletonCloneableReflection.class.getDeclaredConstructors();
//		for(Constructor cstr : constructors) {
//			cstr.setAccessible(true);
//			obj2 = (DoubleCheckingLazySingletonCloneableReflection)cstr.newInstance();
//		}
//		System.out.println(obj2.hashCode());
		
													//SERIALIZATION
		DoubleCheckingLazySingletonCloneableReflectionSerialization obj1 = DoubleCheckingLazySingletonCloneableReflectionSerialization.getInstance();
		System.out.println(obj1.hashCode());
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("SingletonSerialized.ser"));
		out.writeObject(obj1);
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("SingletonSerialized.ser"));
		DoubleCheckingLazySingletonCloneableReflectionSerialization obj2 = (DoubleCheckingLazySingletonCloneableReflectionSerialization)in.readObject();
		System.out.println(obj2.hashCode());
	}
}
