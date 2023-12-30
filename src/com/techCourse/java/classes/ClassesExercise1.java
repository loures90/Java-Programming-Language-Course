package com.techCourse.java.classes;

import java.util.HashMap;

class Stack {
	private HashMap<Integer, String> stack = new HashMap<Integer, String>();
	private Integer top = 0;
	
	public void push(String value) {
		if (stack.get(top) != null) {
			top+=1;			
		}
		stack.put(top, value);
	}
	
	public void pop() {
		if (stack.get(top) != null) {
			stack.remove(top);
			top-=1;			
		}
	}
	
	public String peek() {
		return stack.get(top) == null ? "empty" : stack.get(top);
	}
}

public class ClassesExercise1 {
	public static void main(String[] args) {
		Stack stack1 = new Stack();
		stack1.push("value 1");
		stack1.push("value 2");
		stack1.push("value 3");
		
		System.out.println(stack1.peek());
		stack1.pop();

		System.out.println(stack1.peek());
		stack1.pop();
		System.out.println(stack1.peek());
		stack1.pop();
		
		System.out.println(stack1.peek());
		stack1.pop();
		stack1.push("value 3");
		
		System.out.println(stack1.peek());
		
	}

}
