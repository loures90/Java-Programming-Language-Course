package com.techCourse.java.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionsEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {20,10,30,40,10,20,30};
		HashSet<Integer> hash = new HashSet<Integer>();
		LinkedHashSet<Integer> linkedHash = new LinkedHashSet<Integer>();
		TreeSet<Integer> treeSet = new TreeSet();
		for (int ele : a) {
			if (!hash.add(ele)) {
			System.out.println("Repeated values: " + ele);				
		}
			if (!linkedHash.add(ele)) {
			System.out.println("Repeated values: " + ele);				
			}
			if (!treeSet.add(ele)) {
				System.out.println("Repeated values: " + ele);				
			}
		}
		System.out.println("Not repeated hashList: " + hash.toString()); // order is not kept
		System.out.println("Not repeated LinkedHashSet: " + linkedHash.toString()); // it keeps the order
		System.out.println("Not repeated treeset: " + treeSet.toString()); // it sort the elements
	}

}
