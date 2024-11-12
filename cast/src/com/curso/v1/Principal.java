package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		Object obj1 = new StringBuilder("Hello");
				
		String cadena = (String)obj1; //ClassCastException
		
		System.out.println(cadena);
		
	}

}
