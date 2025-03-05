package com.corejava.example.pattern.decorator;

public abstract class PizzaDecorator implements Pizza {
	protected Pizza decoratedPizza; 
	
	public PizzaDecorator(Pizza pizza) {
		super();
		this.decoratedPizza = pizza;
	}
	
}
