package com.gl.javafsd.datastructures.arrayrotation;

public class ArrayMultipleRotater {
	private int[] array;
	private int[] backupArray;
	
	public ArrayMultipleRotater(int[] array) {
		this.array = array;
		this.backupArray = new int[array.length];
		System.arraycopy(array, 0, backupArray, 0, array.length);
	}
	
	public void rotateMultipleTimesV1(int recurrencyCount) {
		//recurrencyCount = N
		// N times run the code of rotate by left by 1 position
	}
	
	public void rotateMultipleTimes(int recurrencyCount) {
		int arrayLength = backupArray.length;
		
		for(int index = 0; index < arrayLength; index++ ) {
			int currentElement = backupArray[index];
			int targetIndex = findTargetIndex (index, recurrencyCount); 
			array[targetIndex] = currentElement;
		}
	}

	private int findTargetIndex(int currentIndex, int recurrencyCount) {
		int targetIndex = currentIndex - recurrencyCount;
		if(targetIndex < 0) {
			targetIndex = backupArray.length + targetIndex;
		}
		return targetIndex;
	}
	
}
