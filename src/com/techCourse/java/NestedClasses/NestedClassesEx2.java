package com.techCourse.java.NestedClasses;

import java.util.Iterator;

class MyArray implements Iterable<Integer> {
	private Integer arr[];
	private int size;
	private int curPos;
	
	public MyArray(int size) {
		this.size = size;
		arr = new Integer[size];
		curPos = -1;
	}
	
	public void add (Integer value) throws Exception {
		if (curPos <= size -1) {
			arr[++curPos] = value;
		} else {
			throw new Exception();
		}
	}
	
	public void print () {
		for (int i =0; i <= curPos; i++) {
			System.out.println(arr[i]);
		}
	}

	@Override
	public Iterator<Integer> iterator() {
		return new MyArrayIterator();
	}
	
	class MyArrayIterator implements Iterator<Integer> {
		private int pos = 0;
		@Override
		public boolean hasNext() {
			return pos <= curPos;
		}

		@Override
		public Integer next() {
			return arr[pos++];
		}
		
	}
	
}

public class NestedClassesEx2 {

	public static void main(String[] args) throws Exception {
		MyArray arr = new MyArray(3);
		arr.add(10);
		arr.add(40);
		arr.add(60);
		arr.print();
		System.out.println("--- ");
		for (Integer val : arr) {
			System.out.println(val);
		}
		System.out.println("--- ");
		
		Iterator<Integer> itr = arr.iterator(); 
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
