package com.gl.javafsd.datastructures.mergesort.desc;

import com.gl.javafsd.datastructures.utils.DataStructuresUtils;

public class MergeSortDescTest {
	
	public static void main(String[] args) {
		testMergeSortOnEvenArray();
		testMergeSortOnOddArray();
	}

	private static void testMergeSortOnOddArray() {
		
		int[] oddArray = DataStructuresUtils.generateRandomArray(7);
		genericSortDescTest(oddArray);		
	}

	private static void testMergeSortOnEvenArray() {

		int[] evenArray = DataStructuresUtils.generateRandomArray(8);
		genericSortDescTest(evenArray);		
	}
	
	private static void genericSortDescTest(int[] array) {
		
		System.out.println("-------------UnSorted Array ---------");
		DataStructuresUtils.printArray(array);
		MergeSortDesc mergeSort = new MergeSortDesc();
		mergeSort.sortDesc(array, 0, array.length - 1);
		System.out.println("-------------Sorted Array [DESC] ---------");
		DataStructuresUtils.printArray(array);
		System.out.println("");		
	}
}
