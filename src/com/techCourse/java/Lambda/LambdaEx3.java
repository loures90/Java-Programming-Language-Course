package com.techCourse.java.Lambda;

import java.util.Arrays;
import java.util.Comparator;

/*
  * Function interfaces must have one method only
  * */


public class LambdaEx3 {

	public static void main(String[] args) {
		String arr[] = {"abc", "def", "ABC", "z"};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// separated class
		String arr2[] = {"abc", "def", "ABC", "z"};
		Arrays.sort(arr2, new DescSortArray());
		System.out.println(Arrays.toString(arr2));
		
		//anonymous class
		String arr3[] = {"abc", "def", "ABC", "z"};
		Arrays.sort(arr3, new Comparator<String>(){
			public int compare(String o1, String o2) {
				return -1 * o1.compareTo(o2);
			}
		});
		System.out.println(Arrays.toString(arr3));
		
		// lambda function
		String arr4[] = {"abc", "def", "ABC", "z"};
		Arrays.sort(arr4, (o1, o2) -> -1 * o1.compareTo(o2));
		System.out.println(Arrays.toString(arr4));
		
		String arr5[] = {"abc", "def", "ABC", "z"};
		Arrays.sort(arr5, (o1, o2) -> o1.compareToIgnoreCase(o2));
		System.out.println(Arrays.toString(arr5));
		
		// lambda with method reference
		String arr6[] = {"abc", "def", "ABC", "z"};
		Arrays.sort(arr6, String::compareToIgnoreCase);
		System.out.println(Arrays.toString(arr5));
		
		
	}

}

class DescSortArray implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return -1 * o1.compareTo(o2);
	}
	
}
