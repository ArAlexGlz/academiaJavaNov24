package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		System.out.println("V1");
		int r = 0;
		r = calcular(8,0);
		System.out.println(r);
		
		System.out.println("FIN DE PROGRAMA");
	
	}
	
	static int calcular(int x, int y) {
		
		if (y==0)
			throw new DividirCero("No se puede dividir entre Cero");
		
		return x/y;
	}

}
