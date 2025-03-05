package com.corejava.example.pattern.decorator;

public class CheezePizza extends PizzaDecorator {

	public CheezePizza(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDescription() {
		return decoratedPizza.getDescription() + ", Cheese";
	}

	@Override
	public double getCost() {
		return decoratedPizza.getCost() + 1.5;
	}

}
