package com.curso.autocloseable.v2;

public class Conexion implements AutoCloseable {
	
	private String name;

	public Conexion(String name) {
		this.name = name;
	}
	
	void open() throws ConexionException {
		System.out.println("Abrir Conexion");
		//throw new ConexionException("ERROR!!!");
	}
	
	//Obligatorio para cerrar los recursos;
	@Override
	public void close() {
		System.out.println("***Cerrar Conexion***");
	}
	

}
