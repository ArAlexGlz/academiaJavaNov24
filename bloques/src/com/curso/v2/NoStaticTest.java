package com.curso.v2;

public class NoStaticTest {
	
	static{ //Bloque de inicialización STATIC
		System.out.println("PASO 1 Static"); //1
	}
	
	{ //Bloque de inicialización
		System.out.println("PASO 1 Instancia");
	}

	public static void main(String[] args) {
		System.out.println("Hello"); //3
	}
	
	{ //Bloque de inicialización
		System.out.println("PASO 2 Instancia");
	}
	
	static{ //Bloque de inicialización STATIC
		System.out.println("PASO 2 Static"); //2
	}

}
