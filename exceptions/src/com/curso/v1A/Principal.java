package com.curso.v1A;

public class Principal {

	public static void main(String[] args) {
		System.out.println("V1A");
		int r = 0;
		try {
			r = calcular(8,0);
		}catch(DividirCero e) {
			System.out.println(e);
		}
		
		System.out.println(r);
		
		System.out.println("FIN DE PROGRAMA");
	
	}
	
	static int calcular(int x, int y) throws DividirCero {
		
		if (y==0)
			throw new DividirCero("No se puede dividir entre Cero");
		
		return x/y;
	}

}
