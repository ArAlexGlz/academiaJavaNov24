package com.curso.v0;

public class Question09 {

	public static void main(String[] args) {

		int a = 2, b = 4, c = 2;

		System.out.println(a > 2 ? --c : b++); //4
		//System.out.println(b); //5
		
		//                     false        5
		System.out.println(b = (a!=c ? a : b++)); //5
		
		System.out.println(b); //5
		
		//b = b++; //AGUAS
		
		System.out.println(a > b ?  (b < c ? b : 2 ): 1); //1
	}

}
