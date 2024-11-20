package com.curso.v1;

public class Principal1 {
	
	public static void main(String[] args) {
		
		show(1,2,3,4,5);
		System.out.println("*****");
		show(1,2,3,4,5,6,7,8,9,10);
		System.out.println("*****");
		show();
	}
	
	static void show(int... arrayint) {
		System.out.println("BEGIN");
		for (int i: arrayint)
			System.out.println(i);
		
	}

}
