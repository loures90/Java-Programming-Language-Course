package com.techCournse.java.Overloading;

class SearchUtil {
	public static int search(int[] arr, int element) {
		return search(arr, 0, element);
	}
	
	public static int search(int[] arr, int pos, int element) {
		for (int i = pos; i < arr.length; i++) {
			if(arr[i] == element) {
				return i;
			}
		}
		return -1;
	}
	
	public static int search(String[] arr, String element) {
		return search(arr, 0, element);
	}
	
	public static int search(String[] arr, int pos, String element) {
		for (int i = pos; i < arr.length; i++) {
			if(arr[i] == element) {
				return i;
			}
		}
		return -1;
	}
}

public class OverloadingEX1 {
	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 20, 20, 30, 44};
		int searchEl = 20;
		int index = -1;
		do {
			index = SearchUtil.search(arr, index +1, searchEl);
			if (index != -1) {
				System.out.println("Found " + searchEl + " at: " + index);				
			}
		} while(index != -1);
		
		String arrS[] = {"a", "b", "c", "a", "a", "a", "a", "c"};
		String searchString = "a";
		int j = -1;
		do {
			j = SearchUtil.search(arrS, j +1, searchString);
			if (j != -1) {
				System.out.println("Found " + searchString + " at: " + j);				
			}
		} while(j != -1);
		
	}
}
