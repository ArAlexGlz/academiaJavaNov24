package com.curso.v2;

public class Pato {
	
	String nombre; 
	private static int contador; //0
		
	Pato(String nombre) {
		this.nombre = nombre;
		contador++;
	}
	
	public static int getContador() {
		return contador;
	}
	
}
