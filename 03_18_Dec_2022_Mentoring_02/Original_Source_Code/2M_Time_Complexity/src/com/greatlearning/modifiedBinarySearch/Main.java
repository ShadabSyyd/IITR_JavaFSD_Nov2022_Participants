package com.greatlearning.modifiedBinarySearch;

import java.util.Scanner;

import com.greatlearning.mergeSort.MergeSort;

class Main {

	// main function
	public static void main(String args[]) {

		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
	 
		//sorted and rotated array.
		int[] array =  {12,13,14,9,10,11};
		System.out.println("enter the key ");
		int key = sc.nextInt();
		ModifiedBinarySearch pivotedBinarySearch = new ModifiedBinarySearch();
		int index = pivotedBinarySearch.pivotedBinarySearch(array, array.length, key);
		System.out.println("key is present at index " + index);
		sc.close();
	}
}
