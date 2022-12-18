package com.gl.javafsd.datastructures.mergesort;

public class DividePhase {
	
	int[] array;
	
	public DividePhase(int[] array) {
		this.array = array;
	}
	
	public void divide() {
		int beginIndex = 0;
		int endIndex = array.length - 1;
		divide("Root", beginIndex, endIndex);
	}
	
	private void divide(String indicator, int beginIndex, int endIndex) {
		
		if(beginIndex < endIndex) {
			System.out.println(String.format(indicator + " Begin : %d, End : %d",
					beginIndex, endIndex));
			int midPointIndex = (beginIndex + endIndex) / 2;
			
			divide("L", beginIndex, midPointIndex);//Left side split
			divide("R", (midPointIndex + 1), endIndex);//Right side split
		}
			
		
	}
	
}
