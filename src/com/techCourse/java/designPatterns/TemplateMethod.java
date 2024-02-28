package com.techCourse.java.designPatterns;

abstract class Search {
	public int search (int arr[], int ele) {
		for (int i = 0; i < arr.length; i++) {
			if (compare(arr[i], ele)) {
				return i;
			}
		}
		return -1;
	}
	
	protected abstract boolean compare(int a, int b);
}

class SearchEqualsAlgo extends Search {
	@Override
	protected boolean compare(int a, int b) {
		return a == b;
	}
}

class SearchDifferentAlgo extends Search {
	@Override
	protected boolean compare(int a, int b) {
		return a != b;
	}
}

class SearchIsGreatherAlgo extends Search {
	@Override
	protected boolean compare(int a, int b) {
		return a > b;
	}
}




public class TemplateMethod {

	public static void main(String[] args) {
		int numbers[] = {1,2,3,45,89,3,2};
		Search searchIsGreatherAlgo = new SearchIsGreatherAlgo();
		int result = searchIsGreatherAlgo.search(numbers, 100);
		if (result >= 0) {
			System.out.println("Found number " + result + " greather than " + 100);
		} else {
			System.out.println("Not found");
		}
		Search searchDifferentAlgo = new SearchDifferentAlgo();
		int result1 = searchDifferentAlgo.search(numbers, 100);
		if (result1 >= 0) {
			System.out.println("Found number " + result1 );
		} else {
			System.out.println("Not found");
		}
		
	}

}
