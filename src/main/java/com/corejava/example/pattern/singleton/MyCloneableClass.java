package com.corejava.example.pattern.singleton;

import java.io.Serializable;

public class MyCloneableClass implements Cloneable, Serializable {

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
		
}
