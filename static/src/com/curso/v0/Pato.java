package com.curso.v0;

public class Pato {
	
	String nombre; 
	int contador; //0
	
//	Pato(){
//		System.out.println("CONSTRUCTOR DEFAULT");
//	}
	
	//CONSTRUCTOR
	Pato(String nombre) {
		System.out.println("PASO POR AQUI");
		this.nombre = nombre;
		contador++;
	}
	
}
