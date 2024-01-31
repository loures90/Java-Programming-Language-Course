package com.techCourse.java.Collections;

import java.util.Collection;
import java.util.HashMap;
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


public class CollectionsEx3 {
	
	public static void main(String[] args) {
		HashMap<String, Integer> fruitMap = new HashMap();
		fruitMap.put("apple", 10);
		fruitMap.put("pear", 20);
		fruitMap.put("banana", 40);
		
		Integer bananaPrice = fruitMap.get("banana");
		System.out.println(bananaPrice);
		
		for (String key : fruitMap.keySet()) {
			Integer price = fruitMap.get(key);
			System.out.println(key + " --- " + price);
		}
		
		
		
	}

}
