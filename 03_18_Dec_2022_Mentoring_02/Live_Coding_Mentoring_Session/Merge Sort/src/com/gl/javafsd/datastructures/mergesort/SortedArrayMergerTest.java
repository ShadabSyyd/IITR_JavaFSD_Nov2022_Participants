package com.gl.javafsd.datastructures.mergesort;

import com.gl.javafsd.datastructures.utils.DataStructuresUtils;

public class SortedArrayMergerTest {
	public static void main(String[] args) {
		testMergeSameSizedArrays();
		testMergeDifferentSizedArrays();
	}

	private static void testMergeDifferentSizedArrays() {
		System.out.println("------------------");
		int[] aArray = DataStructuresUtils.generateRandomSortedArray(5);
		DataStructuresUtils.printArray(aArray);
		
		int[] bArray = DataStructuresUtils.generateRandomSortedArray(3);
		DataStructuresUtils.printArray(bArray);
		
		SortedArrayMerger merging = new SortedArrayMerger(aArray, bArray);
		int[] cArray = merging.merge();
		DataStructuresUtils.printArray(cArray);
	}

	private static void testMergeSameSizedArrays() {
		System.out.println("------------------");
		int[] aArray = DataStructuresUtils.generateRandomSortedArray(4);
		DataStructuresUtils.printArray(aArray);
		
		int[] bArray = DataStructuresUtils.generateRandomSortedArray(4);
		DataStructuresUtils.printArray(bArray);
		
		SortedArrayMerger merging = new SortedArrayMerger(aArray, bArray);
		int[] cArray = merging.merge();
		DataStructuresUtils.printArray(cArray);
	}
	
	
	
}
