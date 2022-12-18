package com.gl.javafsd.datastructures.binarysearch;

public class BinarySearchTest {
	public static void main(String[] args) {
		searchElementTest();
	}
	
	public static void searchElementTest() {
		int[] sortedArray = 
			{75, 498, 1136, 1818, 1977, 2453, 2486, 2898, 3049, 3113, 3870};
		
		int[] searchValuesArray = {75, 3113, 498, 2453, 2898};
		BinarySearch search = new BinarySearch(sortedArray);
		
		for (int index = 0; index < searchValuesArray.length ; index++) {
			int searchElement = searchValuesArray[index];
			int searchElementIndex = search.search(searchElement);
			
			System.out.println(String.format("Element %d present at index %d",
					searchElement, searchElementIndex));
			
			System.out.println("--------------------" );
		}
		
	}
}
