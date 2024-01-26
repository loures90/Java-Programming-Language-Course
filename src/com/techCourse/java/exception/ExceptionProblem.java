package com.techCourse.java.exception;

import java.util.Optional;

class StackException extends Exception {
	public StackException(String reason) {
		super(reason);
	}
}

class Stack {
	private Integer arr[];
	private Integer top;
	private Integer limit;
	
	private final Integer DEFAULT_LIMIT = 5;
	
	public Stack() {
		this.initiator(DEFAULT_LIMIT);
	}
	public Stack(Integer size) {
		this.initiator(size);
	}
	private void initiator(Integer size) {
		arr = new Integer[size];
		top = -1;
		limit = size;
	}
	
	public void push(Integer value) throws StackException {
		if (top > limit -2) {
			throw new StackException("limit overload");
		}
		arr[++top] = value;
	}
	
	public Integer pop() throws StackException{
		if (isEmpty()) {
			throw new StackException("Array empty");
		}
		return arr[top--];
	}
	public Optional<Integer> peek() throws StackException{
		if (isEmpty()) {
			return Optional.empty();
		}
		return Optional.of(arr[top]);
	}
	
	private boolean isEmpty() {
		return top == -1;
	}
	
}

public class ExceptionProblem {
	public static void main(String[] args) throws StackException {
		Stack stack = new Stack(3);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		Optional<Integer> peek = stack.peek();
		System.out.println(peek.get());
//		stack.push(40);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek().get());
		System.out.println(stack.pop());
//		System.out.println(stack.pop());
	}
	
}
