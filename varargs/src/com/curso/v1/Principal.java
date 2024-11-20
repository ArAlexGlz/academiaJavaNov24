package com.curso.v1;

public class Principal {
	
	public static void main(String[] args) {
		
		show(new int[]{1,2,3,4,5});
		System.out.println("*****");
		show(new int[]{});
	}
	
	static void show(int[] arrayint) {
		
		for (int i: arrayint)
			System.out.println(i);
		
	}

}
