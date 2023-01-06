package com.gl.javafsd.datastructures.utils;

import java.util.Random;

public class DataStructuresUtils {
	
	public static int[] generateRandomArray (int size) {
		
		int resultArray[] = new int[size];
		for (int index = 0; index < size ; index ++) {
			int randomNumber = generateRandomNumber();
			resultArray[index] = randomNumber;
		}
		return resultArray;
	} 

	private static int generateRandomNumber() {
		Random random = new Random();
		int randomNumber = random.nextInt(1, 1000);
		//System.out.println("random num : " + randomNumber);
		return randomNumber;
	}

	public static void printArray(int[] array) {
		System.out.print("{ ");
		int arrayLength = array.length;
		for (int index = 0; index < arrayLength; index++) {
			System.out.print(array[index]);
			if(index != arrayLength - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("} ") ;
	}
	
	public static int[] generateRandomSortedArray(int size) {
		
		int resultArray[] = new int [size];
		int firstValue = generateRandomNumber();
		resultArray[0] = firstValue;
		
		for (int index = 1; index < size; index ++) {
			int prevValue = resultArray[index -1];
			int randomValue = generateRandomNumber();
			int currentValue = prevValue + randomValue;
			resultArray[index] = currentValue;
		}
		return resultArray;
	}
	
	public static int getRandomElement(int[] array) {
		int arraySize = array.length;
		Random random = new Random(); 
		int randomIndex = random.nextInt(arraySize);
		int randomElement = array[randomIndex];
		return randomElement;
	}
	
	public static void printWithIndex(int[] array) {
		
		System.out.print("{ ");
		for (int index = 0; index < array.length; index ++) {	

			System.out.print("(" + index + ") ");

			System.out.print("[" + array[index] + "]");
			
			if (index != (array.length - 1)) {
				System.out.print(", ");
			}
		}
		System.out.println(" }");
	}
	
	public static String concatenate(int[] array) {
		
		StringBuilder result = new StringBuilder();
		result.append("{ ");
		for (int index = 0; index < array.length; index ++) {	

			result.append(array[index]);

			if (index != (array.length - 1)) {
				result.append(", ");
			}
		}
		result.append(" }");
		return result.toString();
	}
	
}
