package com.curso.v1;

public class NoStaticTest {
	
	{ //Bloque de inicialización
		System.out.println("PASO 1");
	}

	public static void main(String[] args) {
		new NoStaticTest();
		System.out.println("Hello");
		new NoStaticTest();
	}
	
	{ //Bloque de inicialización
		System.out.println("PASO 2");
	}

}
