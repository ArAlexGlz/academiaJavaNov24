package com.curso.actual.v0;

import java.util.Arrays;

public class Q19 {

	public static void main(String[] args) {

		int[] array2D [] = {{0, 1, 2}, {3, 4, 5, 6}};
		System.out.print(array2D[0].length + " "); //3
		System.out.print(array2D[1].getClass().isArray() + " "); //true
		System.out.println(array2D[0][1]);//1
		
		System.out.println("****************");
		
		int[] array = {1,2,3,4,5};
		
		System.arraycopy(array, 2, array, 1, 2);
		
		System.out.println(Arrays.toString(array));
		/*
		Array original:
			[1] [2] [3] [4] [5]
			0   1   2   3   4   (índices)

			System.arraycopy(array, 2, array, 1, 2):
			                ↓     ↓     ↓     ↓
			              fuente  n   destino long
			              (idx 2) elementos (idx 1)  (2 elementos)

			Copiando [3,4] desde índice 2 hacia índice 1:
			[1] [3] [4] [4] [5]
			   ↑   ↑
			 nuevas posiciones
	    */
		
		
		
		
		
	}

}
