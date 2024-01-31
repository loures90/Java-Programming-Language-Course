package com.techCourse.java.Collections;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
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


public class CollectionsEx4 {
	
	public static void main(String[] args) {
		String sentence = "This is a sentence bbbbbbbb";
		String[] words = sentence.split("");
		
//		HashMap<String, Integer> wordsMap = new HashMap<String, Integer>();
		TreeMap<String, Integer> wordsMap = new TreeMap<String, Integer>();
		
		System.out.println(words);
		for (String word: words) {
			if (!word.equalsIgnoreCase(" ")) {
			word = word.toLowerCase();
			Integer count = wordsMap.get(word);
			if (count == null) {
				count =0;
			} 
			wordsMap.put( word,  ++count);
			}
		}
		
		for (String word : wordsMap.keySet()) {
			Integer counts = wordsMap.get(word);
			System.out.println(word + " --- " + counts);
		}
		
		
		
	}

}
