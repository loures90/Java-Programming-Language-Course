package com.techCourse.java.Collections;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

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
 * 			TreeMap - (C)
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

class Fruit {
	private String name;
	public Fruit(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(this.name);
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Fruit) || obj == null) {
			return false;
		}
		return this.name.equals(((Fruit)obj).name);
	}
	
	
}


public class CollectionsEx5 {
	
	public static void main(String[] args) {
		HashSet<Fruit> set = new HashSet<Fruit>();
		
		set.add(new Fruit("apple"));
		set.add(new Fruit("mango"));
		set.add(new Fruit("apple"));
		
		System.out.println(set);
	}

}
