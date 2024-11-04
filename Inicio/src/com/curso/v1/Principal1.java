package com.curso.v1;

public class Principal1 {

	public static void main(String[] args) {

		for (int x=0;x<10;x++) {
			//x = x++;
			System.out.println(x);
		}
		
		byte b1 = 5;
		byte b2 = 7;
		
		int b3 = b1 + b2; //12
		
		b1 = (byte)(b1 * b2);
		
		//b1 *= b2;
		
		System.out.println(b1);
	}

}
