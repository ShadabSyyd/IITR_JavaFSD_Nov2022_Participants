package com.greatlearning.arrayRotation;

import java.util.Scanner;

import com.greatlearning.mergeSort.MergeSort;

class Main {

	// main function
	public static void main(String args[]) {

		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("enter the elements in the sorted order");
		System.out.println("enter the " + size + " elements");
		int array[] = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}


		int midElement = array[array.length / 2];

		ArrayRotation arrayRotation = new ArrayRotation();

		arrayRotation.leftRotate(array, midElement, array.length);

		System.out.println("the Array after rotation is ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		
	}
	
}
