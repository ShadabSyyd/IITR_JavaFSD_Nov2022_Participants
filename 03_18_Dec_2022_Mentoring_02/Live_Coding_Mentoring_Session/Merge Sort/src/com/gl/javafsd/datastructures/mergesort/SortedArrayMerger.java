package com.gl.javafsd.datastructures.mergesort;

public class SortedArrayMerger {

	private int[] aArray;
	private int[] bArray;
	private int[] cArray;
	
	public SortedArrayMerger(int[] aArray, int[] bArray) {
		this.aArray = aArray;
		this.bArray = bArray;
		this.cArray = new int[aArray.length + bArray.length];
	}
	
	public int[] merge() {
		
		int aIndex = 0;
		int bIndex = 0;
		int cIndex = 0;
		
		//this continues as long as both the arrays has elements to read
		//exits even if of them does not have any more elements to read
		while (aIndex < aArray.length && bIndex < bArray.length) {
			if(aArray[aIndex] < bArray[bIndex]) {
				cArray[cIndex] = aArray[aIndex];
				aIndex++;
				cIndex++;
			} else {
				cArray[cIndex] = bArray[bIndex];
				bIndex++;
				cIndex++;
			}
			
		}
		
		//one way of implementation
		//add your own variation
		for(; aIndex < aArray.length ; aIndex++) {
			cArray[cIndex] = aArray[aIndex];
			cIndex++;
		}
		
		for(; bIndex < bArray.length ; bIndex++) {
			cArray[cIndex] = bArray[bIndex];
			cIndex++;
		}
		return this.cArray;
	}
}
