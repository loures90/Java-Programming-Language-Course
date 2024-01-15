package com.techCourse.java.abstracts;

import java.util.Scanner;
/*
 * An abstract class define a skeleton 
 * An abstract methods is open to modify the behavior of the algorithm
 * */

abstract class SearchAlgo {
	// algorithm
	public int search(int[] arr, int element){
		for (int i = 0; i < arr.length; i++) {
			if (match(arr[i], element)) {
				return i;
			}
		}
		return -1;
	}
	// method to be modified
	public abstract boolean match(int arrElement, int element);
}

class SearchAlgoEqual extends SearchAlgo {
	public boolean match(int arrElement, int element) {
		return arrElement == element;
	}
}

class SearchAlgoDifferent extends SearchAlgo {
	public boolean match(int arrElement, int element) {
		return arrElement != element;
	}
}

class SearchAlgoGreater extends SearchAlgo {
	public boolean match(int arrElement, int element) {
		return arrElement > element;
	}
}

class SearchAlgoLess extends SearchAlgo {
	public boolean match(int arrElement, int element) {
		return arrElement < element;
	}
}


public class TemplateMethodPattern {
	public static void main(String[] args) {
		int[] arr = {10, 20 ,30 ,40, 50};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int element = scan.nextInt();
		SearchAlgo search = new SearchAlgoDifferent();
		int result = search.search(arr, element);
		if (result != -1) {
			System.out.println("Found at " + result);
		} else {
			System.out.println("Not found");
		}
		
	}

}
