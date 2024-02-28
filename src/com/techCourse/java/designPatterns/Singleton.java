package com.techCourse.java.designPatterns;

/*
 * 
 * Singleton Pattern -
 *  - Only one object/instance per container
 *  - Used when instance creation is costly
 *  - Examples usages
 *  	- Runtime.getRuntime()
 *  	- System.getSecurityManager()
 * 
 * */

class Sample {
	private Sample() {}
	
//	private static Sample instance = new Sample();
	private static Sample instance = null;
	
//	public static Sample getInstance() {
//		return instance;
//	}
	
//	public static Sample getInstance() {
//		if (instance == null) {
//			instance = new Sample();
//		}
//		return instance;
//	}
	
	public static Sample getInstance() {
		if (instance == null) {
			instance = new Sample();
		}
		return instance;
	}
	
	public void sayHello(String name) {
		System.out.println("Hello " + name + "!!");
	}
}

public class Singleton {
	public static void main(String[] args) {
		Sample s1 = Sample.getInstance();
		Sample s2 = Sample.getInstance();
		System.out.println("s1 == s2 => " + (s1 == s2));
		s1.sayHello("bla");
	}

}
