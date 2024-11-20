package com.curso.v3;

public class Concluye implements Predicado {

	@Override
	public boolean probar(String cadena) {
		return cadena.endsWith("x");
	}

}
