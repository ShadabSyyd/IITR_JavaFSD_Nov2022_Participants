package com.gl.javafsd.datastructures.arrayrotation;

public class ArrayRotater {
	
	private int[] array;
	
	public ArrayRotater(int[] array) {
		this.array = array;
	}
	
	public void rotateLeft() {
		int lastPosition = array.length - 1;//array length = 4 // lastPosition = 3
		int firstElement = array[0];
		for (int index = 0; index < lastPosition ; index++) {//upto last but one element
			int currentIndex = index;//1
			int nextElement = array [currentIndex + 1]; //element at position 2
			array[currentIndex] = nextElement;
		}
		array[lastPosition] = firstElement;
	}
	
	public void rotateLeftV2() {
		int lastPosition = array.length - 1;
		int firstElement = Integer.MIN_VALUE;
		
		for (int index = 0; index <= lastPosition ; index++) {//upto last element
			int currentIndex = index;
			if(currentIndex == 0) {//first element
				firstElement = array[currentIndex];
				int nextElement = array [currentIndex + 1];
				array[currentIndex] = nextElement;
			} else if (currentIndex == lastPosition) {
				array[currentIndex] = firstElement;
			} else {
				int nextElement = array[currentIndex + 1];
				array[currentIndex] = nextElement;
			}
		}
		
	}
	
}
