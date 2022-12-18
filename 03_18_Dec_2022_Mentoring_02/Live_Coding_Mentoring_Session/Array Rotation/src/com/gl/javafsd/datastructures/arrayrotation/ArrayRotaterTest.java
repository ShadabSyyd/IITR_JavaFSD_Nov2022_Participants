package com.gl.javafsd.datastructures.arrayrotation;

import com.gl.javafsd.datastructures.utils.DataStructuresUtils;

public class ArrayRotaterTest {
	public static void main(String[] args) {
		//testRotateLeft();
		testRotateLeftV2();
	}
	
	public static void testRotateLeft() {
		int[] randomArray = DataStructuresUtils.generateRandomArray(7);
		DataStructuresUtils.printArray(randomArray);
		
		ArrayRotater arrayRotater = new ArrayRotater(randomArray);
		arrayRotater.rotateLeft();
		DataStructuresUtils.printArray(randomArray);
	}
	
	public static void testRotateLeftV2() {
		int[] randomArray = DataStructuresUtils.generateRandomArray(7);
		DataStructuresUtils.printArray(randomArray);
		
		ArrayRotater arrayRotater = new ArrayRotater(randomArray);
		arrayRotater.rotateLeftV2();
		DataStructuresUtils.printArray(randomArray);
	}
	
}
