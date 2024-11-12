package com.curso.v2;

public class Principal {

	public static void main(String[] args) {

		Object obj1 = new StringBuilder("Hello");
		String cadena = null;
		
		if (obj1 instanceof String) //false
			cadena = (String)obj1; 
		
		System.out.println(obj1);
		
	}

}
