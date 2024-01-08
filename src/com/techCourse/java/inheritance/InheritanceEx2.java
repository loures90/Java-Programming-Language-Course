package com.techCourse.java.inheritance;

// Generalizing code through Inheritance - all classes instances extends object
// Object
// the base class for all Java classes
// common methods equals(), toString()...

class Animal {
	public void feed() {
		System.out.println("Feeding an animal.");
	}
}
class DomesticAnimal extends Animal {}
class WildAnimal extends Animal {}
class Dog extends DomesticAnimal{}
class Cat extends DomesticAnimal{}
class Lion extends WildAnimal{}
class Tiger extends WildAnimal{}

class Human {}

public class InheritanceEx2 {

	public static void main(String[] args) {
		feed(new Dog());
		feed(new Cat());
		feed(new Lion());
		feed(new Tiger());
		
//		feed(new Human()); Error Human does not inheritance Animal
		
		feedB(new Dog());
		feedB(new Cat());
		feedB(new Lion());
		feedB(new Tiger());
		feedB(new Human()); // works fine
	}
	
	static void feed(Animal a) {
		System.out.println("Feeding an animal.");
	}
	
	static void feedB(Object a) { // Generalizing
		System.out.println("Feeding an animal.");
	}

}
