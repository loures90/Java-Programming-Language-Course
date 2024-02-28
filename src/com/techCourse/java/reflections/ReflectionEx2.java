package com.techCourse.java.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/*
 * Reflection:
 * Used by programs which tend to examine or modify runtime behaviour of the application
 * running in Java virtual machines.
 * Note - Use with caution.
 * 
 * */
class Sample2 {
	public Sample2(){}
	public Sample2(String value){}
	
	private Integer x = 10;
	
	public void someMethod(String value) {}
	public void sayHello(String text) {
		System.out.println("Hello, " + text + "!");
	}
}

public class ReflectionEx2 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//		Sample2 s1 = new Sample2();
//		s1.sayHello("José");
		
		Class<Sample2> clazz = Sample2.class;
		Constructor<Sample2> constructor = clazz.getConstructor();
		Sample2 s1 = constructor.newInstance();
		Method m1 = clazz.getDeclaredMethod("sayHello", String.class);
		m1.invoke(s1, "José");
		s1.sayHello("José");
		
		
	}

}
