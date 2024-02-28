package com.techCourse.java.designPatterns;

import java.util.HashMap;

/*
 *  
 * Decorator Pattern
 * 
 * */

// abstract base class
abstract class Pizza {
	public abstract double cost();
	public abstract String description();
}

// concrete classes
class PeperonePizza  extends Pizza {
	private final double PRICE = 50;
	@Override
	public double cost() {
		return PRICE;
	}

	@Override
	public String description() {
		return "Peperone pizza " + PRICE;
	}
}

class PortuguesePizza extends Pizza {
	private final double PRICE = 54.9;
	@Override
	public double cost() {
		return PRICE;
	}

	@Override
	public String description() {
		return "Portuguese Pizza + " + PRICE;
	}
}

abstract class Toppings extends Pizza {}

class ExtraCheese extends Toppings {
	private Pizza pizza;
	private final double PRICE = 20;
	ExtraCheese(Pizza inputPizza){
		this.pizza = inputPizza;
	}

	@Override
	public double cost() {
		return pizza.cost() + PRICE;
	}

	@Override
	public String description() {
		return pizza.description() + " + ExtraCheese " + PRICE;
	}
}

class ExtraOlives extends Toppings {
	private Pizza pizza;
	private final double PRICE = 10;
	
	ExtraOlives(Pizza inputPizza){
		this.pizza = inputPizza;
	}

	@Override
	public double cost() {
		return pizza.cost() + PRICE;
	}

	@Override
	public String description() {
		return pizza.description() + " + ExtraOlives " + PRICE ;
	}
}



public class DecoratorPattern {

	public static void main(String[] args) {
		Pizza p1 = new ExtraCheese(new PeperonePizza());
		System.out.println(p1.description() + " = " + p1.cost());
		
		Pizza p2 = new ExtraOlives(new ExtraCheese(new PeperonePizza()));
		System.out.println(p2.description() + " = " + p2.cost());
	}

}
