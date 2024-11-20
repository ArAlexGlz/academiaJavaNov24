package com.curso.v4;

public class Concluye implements Predicado<String> {

	@Override
	public boolean probar(String cadena) {
		return cadena.endsWith("x");
	}

}
