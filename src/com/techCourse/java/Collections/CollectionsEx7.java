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
import java.util.TreeSet;

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

class FruitSample implements Comparable<FruitSample> {
	private String name;
	public FruitSample(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name;
	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(this.name);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (!(obj instanceof FruitSample) || obj == null) {
//			return false;
//		}
//		return this.name.equals(((FruitSample)obj).name);
//	}
	@Override
	public int compareTo(FruitSample o) {
		// TODO Auto-generated method stub
		return this.name.compareToIgnoreCase(o.name);
	}
	
}


public class CollectionsEx7 {
	
	public static void main(String[] args) {
		TreeSet<FruitSample> set = new TreeSet<FruitSample>();
		
		set.add(new FruitSample("apple"));
		set.add(new FruitSample("mango"));
		set.add(new FruitSample("apple"));
		
		System.out.println(set);
	}

}
