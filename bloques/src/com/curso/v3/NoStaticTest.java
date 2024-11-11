package com.curso.v3;

public class NoStaticTest {
	
	static{ //Bloque de inicialización STATIC
		System.out.println("PASO 1 Static"); //1
	}
	
	{ //Bloque de inicialización INSTANCIA
		System.out.println("PASO 1 Instancia"); //4 //6
	}

	public static void main(String[] args) {
		System.out.println("Hello"); //3
		new NoStaticTest(); 
		new NoStaticTest();
	}
	
	{ //Bloque de inicialización INSTANCIA
		System.out.println("PASO 2 Instancia"); //5 //7
	}
	
	static{ //Bloque de inicialización STATIC
		System.out.println("PASO 2 Static"); //2
	}

}
