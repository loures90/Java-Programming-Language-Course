package com.techCourse.java.solid;


/*
 * L. Liskov principle: Objects of super class shall be replaced with objects of subclasses
 * */

class Vehicle {
	public void start() {
		System.out.println("Start a vehicle");
	}
	public void stop() {
		System.out.println("Start a vehicle");
	}
}

class Car extends Vehicle {
	public void start() {
//		throw new RuntimeException();
		System.out.println("Start a car");
	}
	public void stop() {
		System.out.println("Start a car");
	}
}

class Bike extends Vehicle {
	public void start() {
		System.out.println("Start a bike");
	}
	public void stop() {
		System.out.println("Start a bike");
	}
}

public class Liskov {
	
	public static void testDrive(Vehicle vehicle) {
		vehicle.start();
		vehicle.stop();
	}
	public static void main(String[] args) {
		testDrive(new Car());
		testDrive(new Bike());
		testDrive(new Vehicle());
	}

}
