package com.curso.v3;

public class Principal {

	public static void main(String[] args) throws DividirCero {
		System.out.println("V3");
		int r = 0;

		r = calcular(8, 0);

		System.out.println(r);

		System.out.println("FIN DE PROGRAMA");

	}

	static int calcular(int x, int y) throws DividirCero {

		if (y == 0)
			throw new DividirCero("No se puede dividir entre Cero");

		return x / y;
	}

}
