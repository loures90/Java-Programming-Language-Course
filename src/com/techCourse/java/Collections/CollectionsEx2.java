package com.techCourse.java.Collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*
 * 	I - Interface
 * 	C - Class
 * 
 *  Collection - (I)
 *  	List - (I)
 *  		ArrayList - (C)
 * 			LinkedList - (C)
 * 		Set - (I)
 *			HashSet - (C) 
 * *  		LinkedHashSet - (C)
 * 			SortedSet - (I)
 * 				TreeSet - (C)
 * 	Map - (I)
 * 		HashMap - (C) 
 * *  	LinkedHashMap - (C)
 * 		SortedMap - (I)
 * 			TreeSet - (C)
 * 
 * 	
 *  ***********************
 *  List - Allows duplicates
 * 	Set - No duplicates
 *  Hash - Uses Hashing (insertion order not preserved)
 *  Linked - Insertion order preserved
 *  Tree - sorted
 *  
 * */


public class CollectionsEx2 {

	public static <T> void iterates(Collection<T> col) {
		for (T value : col) {
			System.out.println(value);
		}
	}
	
	public static <T> void iteratesList(List<T> col) {
		for (T value : col) {
			System.out.println(value);
		}
	}
	
	public static <T> void iteratesSet(Set<T> col) {
		for (T value : col) {
			System.out.println(value);
		}
	}
	
	public static <T> void iteratesWhile(Collection<T> col) {
		Iterator<T> iterator = col.iterator();
		while (iterator.hasNext()) {
			T value = iterator.next();
			System.out.println(value);
		}
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(1);
		list.add(50);
		list.add(70);
		
		iterates(list);
		iteratesList(list);
		iteratesWhile(list);
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(5);
		set.add(20);
		set.add(30);
		
		iterates(set);
		iteratesSet(set);
		iteratesWhile(set);
	}

}
