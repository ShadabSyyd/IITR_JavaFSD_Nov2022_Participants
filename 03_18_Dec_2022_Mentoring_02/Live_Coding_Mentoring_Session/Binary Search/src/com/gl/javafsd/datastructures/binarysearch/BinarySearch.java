package com.gl.javafsd.datastructures.binarysearch;

public class BinarySearch {

	private int[] array;
	private int searchValue;
	
	public BinarySearch(int[] array) {
		this.array = array;
	}
	
	public int search(int searchValue) {
		this.searchValue = searchValue;
		int result = startSearch();
		return result;
	}

	private int startSearch() {
		int startIndex = 0;
		int endIndex = array.length - 1;
		
		while (startIndex <= endIndex) {
			int middleElementIndex = (startIndex + endIndex) /2;
			int middleElementValue = array[middleElementIndex];
			
			if(middleElementValue == searchValue) {
				//search value is at mid point
				return middleElementIndex;
			} else {
				if(searchValue > middleElementValue) {
					//search value is on right side of mid point
					startIndex = middleElementIndex + 1;
				} else if(searchValue < middleElementValue) {
					//search value is on left side of mid point
					endIndex = middleElementIndex - 1;
				}
			}
		}
		//search value not found
		return -1;
	}
}
