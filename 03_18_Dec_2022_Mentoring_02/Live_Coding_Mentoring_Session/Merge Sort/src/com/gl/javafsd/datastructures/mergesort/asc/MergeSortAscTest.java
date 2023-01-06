package com.gl.javafsd.datastructures.mergesort.asc;

import com.gl.javafsd.datastructures.utils.DataStructuresUtils;

public class MergeSortAscTest {
	public static void main(String[] args) {
		testMergeSortOnEvenArray();
		testMergeSortOnOddArray();
	}

	private static void testMergeSortOnOddArray() {
		System.out.println("-------------UnSorted Array ---------");
		int[] oddArray = DataStructuresUtils.generateRandomArray(7);
		DataStructuresUtils.printArray(oddArray);
		MergeSortAsc mergeSort = new MergeSortAsc();
		mergeSort.sortAsc(oddArray, 0, oddArray.length - 1);
		System.out.println("------------ Sorted Array ---------");
		System.out.println("");
		DataStructuresUtils.printArray(oddArray);
	}

	private static void testMergeSortOnEvenArray() {
		System.out.println("-------------UnSorted Array ---------");
		int[] evenArray = DataStructuresUtils.generateRandomArray(8);
		DataStructuresUtils.printArray(evenArray);
		MergeSortAsc mergeSort = new MergeSortAsc();
		mergeSort.sortAsc(evenArray, 0, evenArray.length - 1);
		System.out.println("-------------Sorted Array ---------");
		DataStructuresUtils.printArray(evenArray);
		System.out.println("");
	}
	
}
