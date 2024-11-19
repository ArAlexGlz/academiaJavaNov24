package com.curso.autocloseable.v1;

public class Conexion {
	
	private String name;

	public Conexion(String name) {
		this.name = name;
	}
	
	void open() throws ConexionException {
		System.out.println("Abrir Conexion");
		throw new ConexionException("ERROR!!!");
	}
	
	//Obligatorio para cerrar los recursos;
	void close() {
		System.out.println("Cerrar Conexion");
	}
	

}
