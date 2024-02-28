package com.techCourse.java.Generics;

import java.util.LinkedList;
import java.util.Optional;
import java.util.function.Supplier;

/*
 *  Generics Methods
 * */


class Stack2 <T> {
	private LinkedList<T> list = new LinkedList<T>();

	public void push(T ele) {
		list.addFirst(ele);
	}
	public T pop() {
		return list.removeFirst();
	}
}


public class GenericEx4 {
	public static void main(String[] args) {
		Stack2<String> stk = new Stack2<String>();
		stk.push("a");
		stk.push("a");
		stk.push("a");
		System.out.println(stk.pop());
		
		Stack2<Integer> stk2 = new Stack2<Integer>();
		stk2.push(1);
		stk2.push(2);
		stk2.push(3);
		System.out.println(stk2.pop());
	}
}
