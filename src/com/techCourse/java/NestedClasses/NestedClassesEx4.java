package com.techCourse.java.NestedClasses;

import java.util.Iterator;

// anonymous class

interface Greet {
	public void sayHello(String name);
}


class GreetImp implements Greet{
	public void sayHello(String name) {
		System.out.println("hello " + name);
	}
}

class Base {
	public void f() { System.out.println("f()");}
	public void g() { System.out.println("g()");}
	
}
public class NestedClassesEx4 {

	public static void main(String[] args) {
		Greet greet = new GreetImp();
		greet.sayHello("John");
		
		Greet greet2 = new Greet() {
			public void sayHello(String name) {
				System.out.println("hello " + name + " annonymous call.");
			}
		};
		greet2.sayHello("Mary");
	
		Base b1 = new Base();
		// here anonymous class works like an extension
		Base b2 = new Base() {
			public void g() { System.out.println("g() anonymous");}
		};
		b1.f();
		b1.g();
		
		b2.f();
		b2.g();
	}
	
}
