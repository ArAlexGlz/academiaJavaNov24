package com.curso.v2;

public class Conexion {
	
	static private Conexion conn;
	
	String name;
	//VARIABLE DE CLASE
	static int contador; //0
	
	private Conexion(String name) {
		this.name = name;
		contador++;
	}
	
	public static Conexion getInstance() {
		return conn;
	}

}
