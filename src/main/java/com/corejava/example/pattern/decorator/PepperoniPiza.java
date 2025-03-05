package com.corejava.example.pattern.decorator;

public class PepperoniPiza extends PizzaDecorator {

	public PepperoniPiza(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDescription() {
		return decoratedPizza.getDescription() + ", Peppeoroni";
	}

	@Override
	public double getCost() {
		return decoratedPizza.getCost() + 2;
	}

}
