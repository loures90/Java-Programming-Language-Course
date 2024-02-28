package com.techCourse.java.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


/*
 * Reflection:
 * Used by programs which tend to examine or modify runtime behaviour of the application
 * running in Java virtual machines.
 * Note - Use with caution.
 * 
 * */
class Sample {
	public Sample(){}
	public Sample(String value){}
	
	private Integer x = 10;
	
	public void someMethod(String value) {}
}

public class ReflectionEx1 {

	public static void main(String[] args) throws ClassNotFoundException {
		//Class<Sample> clazz = Sample.class;
		Class clazz = Class.forName("com.techCourse.java.reflections.Sample");
		
		Field[] fields = clazz.getDeclaredFields();
		Constructor [] constructors = clazz.getDeclaredConstructors();
		Method [] methods = clazz.getDeclaredMethods();
		
		System.out.println("Fields are: ");
		for (Field field : fields) {
			System.out.println(field);
		}
		System.out.println("Constructors are: ");
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}
		System.out.println("Methods are: ");
		for (Method method : methods) {
			System.out.println(method);
		}
	}

}
