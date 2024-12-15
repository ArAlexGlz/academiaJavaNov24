package com.curso.v0;

public class Main2 {

	public static void main(String[] args) {

		int i1 = 1;
		int i2 = 010;
		System.out.println(i1+i2); //9

		//binario
		int i3 = 0b101;
		//octal
		int i4 = 010;
		//hexadecimal
		int i5 = 0xABC8;
		
		System.out.println("**********");
		
		for(int x=0; x<10;) {
			x = x++;
			System.out.println(x);
		}
		
		
	}

}
