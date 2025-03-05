package com.corejava.example.pattern.decorator;

public class PlainPizza implements Pizza {

	@Override
	public String getDescription() {
		return "Plain Pizza";
	}

	@Override
	public double getCost() {
		return 1.5;
	}

}
