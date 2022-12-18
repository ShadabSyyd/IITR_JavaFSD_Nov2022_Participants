package com.gl.javafsd.datastructures.arrayrotation;

import com.gl.javafsd.datastructures.utils.DataStructuresUtils;

public class ArrayMultipleRotaterTest {
	public static void main(String[] args) {
		rotateMultipleTest();
	}
	
	public static void rotateMultipleTest() {
		int[] randomArray = DataStructuresUtils.generateRandomArray(7);
		DataStructuresUtils.printArray(randomArray);
		
		ArrayMultipleRotater rotater = new ArrayMultipleRotater(randomArray);
		rotater.rotateMultipleTimes(5);
		DataStructuresUtils.printArray(randomArray);
	}
}
