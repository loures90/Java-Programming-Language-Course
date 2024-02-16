package com.techCourse.java.Generics;

import java.util.Optional;
import java.util.function.Supplier;

/*
 *  Generics Methods
 * */

class StackException extends Exception {
	public StackException(String message){
		super("StackException" + message);
	}
}

class Stack<T> {
	private T arr[];
	private int top;
	private int limit;
	
	public Stack(Supplier<T []> supplier) {
		initialize(supplier);
	}
	
	private void initialize(Supplier<T []> supplier) {
		arr = supplier.get();
		top = -1;
		limit = arr.length;
	}
	
	public void push(T ele) throws StackException {
		if (top < limit - 1) {
			arr[++top] = ele;
		} else {
			throw new StackException("Overflow");
		}
	}
	
	public T pop() throws StackException {
		if (isEmpty()) {
			throw new StackException("Empty");
		} else {
			return arr[top--];
		}
	}
	
	public Optional<T> peek() {
		if (isEmpty()) {
			return Optional.empty();
		} else {
			return Optional.of(arr[top]);
		}
	}
	
	private Boolean isEmpty() {
		return top == -1;
	}
	
}


public class GenericEx3 {
	public static void main(String[] args) throws StackException {
		Stack<Integer> stack = new Stack<Integer>(() -> new Integer[3]);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.peek().get());
		stack.pop();
		System.out.println(stack.peek().get());
		
		
		Stack<Double> stack2 = new Stack<Double>(() -> new Double[3]);
		stack2.push(1.5);
		stack2.push(2.9);
		stack2.push(3.6);
		System.out.println(stack2.peek().get());
		stack2.pop();
		System.out.println(stack2.peek().get());
	}
}
