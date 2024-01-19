package com.techCourse.java.solid;


/*
 * I. Interface Segregation Principle: 
 *  A client should never be forced to implement an interface that it does not use.
 * */

interface VegRestaurant {
	void vegRestaurant();
}

interface NonVegRestaurant {
	void nonVegRestaurant();
}

class AbcVegRestaurant implements VegRestaurant {
	@Override
	public void vegRestaurant() {
		System.out.println("Veg menu");
		
	}
}

class AbcNonVegRestaurant implements NonVegRestaurant {
	@Override
	public void nonVegRestaurant() {
		System.out.println("NonVeg menu");
		
	}
}

class AbcBothRestaurant implements NonVegRestaurant, VegRestaurant {
	@Override
	public void nonVegRestaurant() {
		System.out.println("NonVeg menu");
		
	}

	@Override
	public void vegRestaurant() {
		// TODO Auto-generated method stub
		System.out.println("Veg menu");
	}
}


public class InterfaceSegregation {
		
	public static void main(String[] args) {
		
	}

}
