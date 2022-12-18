package com.gl.javafsd.datastructures.mergesort;

public class RecursionDemo2 {
	
	public static void main(String[] args) {
		
		function1("From Main", 1);
	}
	
	static void function1(String indicator, int counter) {


		if (counter >=1 && counter <=5) {
			System.out.println(indicator + ", counter -> " + counter);

			counter ++;
			function1("First time ", counter);
									
		}else if (counter >=6 && counter <=10) {
			System.out.println(indicator + ", counter -> " + counter);

			counter ++;
			function1("Second time ", counter);			
		}else {
			return;
		}
		
	}
	
}