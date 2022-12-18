package com.greatlearning.driver;

import com.greatlearning.teamFormation.*;

public class TeamFormationMain extends TeamFormation{

	// Driver Code
	public static void main(String args[]) {
		int[] arr = {4,3,5,3};
		int K = 3;
		int N = arr.length;
		System.out.println(countOfTeams(arr, N, K));
	}
}
