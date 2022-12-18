package com.greatlearning.mergeSort;

import java.util.Scanner;

class Main {

	// main function
	public static void main(String args[]) {

		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("enter the " + size + " elements");
		int array[] = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(array, 0, array.length - 1);

		System.out.println("the Array after sorting is ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
