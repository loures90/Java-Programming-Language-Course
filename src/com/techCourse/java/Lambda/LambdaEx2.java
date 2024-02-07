package com.techCourse.java.Lambda;
 /*
  * Function interfaces must have one method only
  * */
interface Greet {
	public void sayHello(String name);
}
public class LambdaEx2 {

	public static void main(String[] args) {
		Greet g1 = (name) -> System.out.println("Hello " + name);
		g1.sayHello("a");
		
		// Lambda - method references
		Greet g2 = System.out::println;
		g2.sayHello("a");
	}

}
