package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		String cadena = "Hello";
		char c = 0;
		
		try {
			c = cadena.charAt(9); 
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}finally {
			System.out.println("Finally");
		}
		
		System.out.println(c); //o
		
		System.out.println("FIN DE PROGRAMA");
		
	}

}
