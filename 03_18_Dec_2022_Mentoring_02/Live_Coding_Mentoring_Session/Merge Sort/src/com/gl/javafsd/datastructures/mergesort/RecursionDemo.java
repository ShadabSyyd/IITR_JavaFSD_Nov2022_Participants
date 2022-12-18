package com.gl.javafsd.datastructures.mergesort;

public class RecursionDemo {

	static int counter = 0;
	
	public static void main(String[] args) {
		function1();
	}
	
	static void function1() {
		
		counter ++;
		System.out.println("Within function1..." + counter);
		
		boolean exitCondition = (counter == 5);
		if (exitCondition) {
			return;
		}
		
		function1();
	}
	
}

