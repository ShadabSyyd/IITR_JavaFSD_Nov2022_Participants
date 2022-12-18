package com.gl.javafsd.datastructures.mergesort;

import com.gl.javafsd.datastructures.utils.DataStructuresUtils;

public class DividePhaseTest {
	public static void main(String[] args) {
		testDividePhaseEvenArray();
		testDividePhaseOddArray();
	}

	private static void testDividePhaseOddArray() {
		System.out.println("------------------");
		int[] oddArray = DataStructuresUtils.generateRandomArray(9);
		DataStructuresUtils.printArray(oddArray);
		DividePhase dividePhase = new DividePhase(oddArray);
		dividePhase.divide();
		DataStructuresUtils.printArray(oddArray);
	}

	private static void testDividePhaseEvenArray() {
		System.out.println("------------------");
		int[] evenArray = DataStructuresUtils.generateRandomArray(8);
		DataStructuresUtils.printArray(evenArray);
		DividePhase dividePhase = new DividePhase(evenArray);
		dividePhase.divide();
		DataStructuresUtils.printArray(evenArray);
	}
}
