package com.nov13.v0;

import java.util.Arrays;

public class Question2A {

	public static void main(String[] args) {
		
		int[][][][] java = new int[2][][][];
		
		int[][] scores1 = {{1,2,3,4},{5,6},{7},{8,9,10},{0,0,0,0,0}};

		for (int[] arrayInt:scores1) {
			System.out.println(Arrays.toString(arrayInt));
		}
		
		System.out.println("*********");
		int[][] scores = new int[5][];
		
		scores[0] = new int[]{1,2,3,4};

		scores[1] = new int[2];
		scores[1][0] = 5;
		scores[1][1] = 6;
		
		scores[2] = new int[1];
		scores[2][0] = 7;
		
		scores[3] = new int[]{8,9,10};
		
		scores[4] = new int[5];
				
		for (int[] arrayInt:scores) {
			System.out.println(Arrays.toString(arrayInt));
		}
	}

}
