package com.corejava.example.pattern.decorator;

public class DecorartorMain {

	public static void main(String[] args) {
		//Create plain pizza
		Pizza pizza = new PlainPizza();
		System.out.println("Before toppings - "+ pizza.getDescription() +" - "+ pizza.getCost());
		
		//Add cheese toppings
		pizza = new CheezePizza(pizza);
		System.out.println("After adding cheese - "+ pizza.getDescription() +" - "+ pizza.getCost());
		
		//Add pepperoni toppings
		pizza = new PepperoniPiza(pizza);
		System.out.println("After adding pepperoni - "+ pizza.getDescription() +" - "+ pizza.getCost());
	}

}
